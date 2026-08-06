import java.io.*;
import java.util.*;
 
public class Main {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
 
    static class Solver {
        int n;
        int[] c, k;
        ArrayList<Integer>[] nodesOfColor;
        ArrayList<Integer>[] adj;
        
        int timer;
        int[] tin, tout, depth;
        int[][] up;
        final int LOG = 19;
        
        ArrayList<int[]>[] vtAdj;
        int[] sz;
        int centroid;
        ArrayList<int[]> reductions; // {value, count}
 
        @SuppressWarnings("unchecked")
        public void solve(FastScanner fs, PrintWriter out) {
            n = fs.nextInt();
            c = new int[n + 1];
            k = new int[n + 1];
            nodesOfColor = new ArrayList[n + 1];
            
            for (int i = 1; i <= n; i++) {
                nodesOfColor[i] = new ArrayList<>();
            }
            for (int i = 1; i <= n; i++) {
                c[i] = fs.nextInt();
                nodesOfColor[c[i]].add(i);
            }
            for (int i = 1; i <= n; i++) {
                k[i] = fs.nextInt();
            }
            
            adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                int u = fs.nextInt();
                int v = fs.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            
            tin = new int[n + 1];
            tout = new int[n + 1];
            depth = new int[n + 1];
            up = new int[n + 1][LOG];
            timer = 0;
            
            dfsLca(1, 1, 0);
            
            long[] ans = new long[n + 1];
            Arrays.fill(ans, -1);
            
            vtAdj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) vtAdj[i] = new ArrayList<>();
            sz = new int[n + 1];
            reductions = new ArrayList<>();
            
            for (int color = 1; color <= n; color++) {
                if (nodesOfColor[color].isEmpty()) continue;
                
                ArrayList<Integer> vec = nodesOfColor[color];
                int m = vec.size();
                
                // Sort by DFS entry time
                vec.sort(Comparator.comparingInt(a -> tin[a]));
                
                ArrayList<Integer> vtNodes = new ArrayList<>(vec);
                for (int i = 0; i < m - 1; i++) {
                    vtNodes.add(getLca(vec.get(i), vec.get(i + 1)));
                }
                vtNodes.sort(Comparator.comparingInt(a -> tin[a]));
                
                // Remove duplicates
                ArrayList<Integer> uniqueVt = new ArrayList<>();
                for (int i = 0; i < vtNodes.size(); i++) {
                    if (i == 0 || !vtNodes.get(i).equals(vtNodes.get(i - 1))) {
                        uniqueVt.add(vtNodes.get(i));
                    }
                }
                vtNodes = uniqueVt;
                
                // Build Virtual Tree
                ArrayList<Integer> st = new ArrayList<>();
                for (int u : vtNodes) {
                    vtAdj[u].clear();
                    while (!st.isEmpty() && !isAncestor(st.get(st.size() - 1), u)) {
                        st.remove(st.size() - 1);
                    }
                    if (!st.isEmpty()) {
                        int p = st.get(st.size() - 1);
                        int weight = getDist(p, u);
                        vtAdj[p].add(new int[]{u, weight});
                        vtAdj[u].add(new int[]{p, weight});
                    }
                    st.add(u);
                }
                
                int root = vtNodes.get(0);
                for (int u : vec) sz[u] = 1;
                
                // Find Centroid
                centroid = -1;
                findCentroid(root, 0, m);
                if (centroid == -1) centroid = root;
                
                // Calculate base cost and collect bundled reductions
                long baseCost = 0;
                reductions.clear();
                getReductions(centroid, 0, color);
                
                for (int u : vec) {
                    baseCost += getDist(centroid, u);
                }
                
                // Greedy choice: Sort reductions descending
                reductions.sort((a, b) -> Integer.compare(b[0], a[0]));
                
                long currentCost = baseCost;
                int needed = k[color] - 1;
                
                for (int[] group : reductions) {
                    if (needed <= 0) break;
                    int val = group[0];
                    int count = group[1];
                    int take = Math.min(needed, count);
                    
                    currentCost -= 1L * take * val;
                    needed -= take;
                }
                
                ans[color] = currentCost;
                
                // Cleanup to O(1) states
                for (int u : vtNodes) sz[u] = 0;
            }
            
            for (int i = 1; i <= n; i++) {
                out.print(ans[i] + (i == n ? "" : " "));
            }
            out.println();
        }
        
        void dfsLca(int u, int p, int d) {
            tin[u] = ++timer;
            depth[u] = d;
            up[u][0] = p;
            for (int i = 1; i < LOG; i++) {
                up[u][i] = up[up[u][i - 1]][i - 1];
            }
            for (int v : adj[u]) {
                if (v != p) dfsLca(v, u, d + 1);
            }
            tout[u] = ++timer;
        }
        
        boolean isAncestor(int u, int v) {
            return tin[u] <= tin[v] && tout[u] >= tout[v];
        }
        
        int getLca(int u, int v) {
            if (isAncestor(u, v)) return u;
            if (isAncestor(v, u)) return v;
            for (int i = LOG - 1; i >= 0; i--) {
                if (!isAncestor(up[u][i], v)) u = up[u][i];
            }
            return up[u][0];
        }
        
        int getDist(int u, int v) {
            return depth[u] + depth[v] - 2 * depth[getLca(u, v)];
        }
        
        void findCentroid(int u, int p, int m) {
            int maxSub = 0;
            for (int[] edge : vtAdj[u]) {
                int v = edge[0];
                if (v != p) {
                    findCentroid(v, u, m);
                    sz[u] += sz[v];
                    maxSub = Math.max(maxSub, sz[v]);
                }
            }
            maxSub = Math.max(maxSub, m - sz[u]);
            if (maxSub <= m / 2 && centroid == -1) {
                centroid = u;
            }
        }
        
        void getReductions(int u, int p, int color) {
            sz[u] = (c[u] == color) ? 1 : 0;
            for (int[] edge : vtAdj[u]) {
                int v = edge[0];
                int dist = edge[1];
                if (v != p) {
                    getReductions(v, u, color);
                    sz[u] += sz[v];
                    if (dist > 0) {
                        reductions.add(new int[]{sz[v], dist});
                    }
                }
            }
        }
    }
 
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        String firstToken = fs.next();
        if (firstToken == null) return;
        int t = Integer.parseInt(firstToken);
        
        while (t-- > 0) {
            new Solver().solve(fs, out);
        }
        out.flush();
        out.close();
    }
}