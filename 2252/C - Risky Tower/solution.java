import java.io.*;
import java.util.*;
 
public class Main {
    
    // Fast I/O to handle large inputs efficiently
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
    }
 
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }
 
            long[][] a = new long[n][m];
            long[] flatA = new long[n * m];
            int ptr = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextLong();
                    flatA[ptr++] = a[i][j];
                }
            }
 
            // Coordinate compression to map large destabilization factors
            Arrays.sort(flatA);
            int uniqueCount = 0;
            for (int i = 0; i < flatA.length; i++) {
                if (i == 0 || flatA[i] != flatA[i - 1]) {
                    flatA[uniqueCount++] = flatA[i];
                }
            }
            long[] uniqueVals = Arrays.copyOf(flatA, uniqueCount);
 
            // Initialize Segment Tree over unique coordinate-compressed values
            SegTree st = new SegTree(uniqueCount, uniqueVals);
 
            // Base case: Collapsing the tower by removing an entire row
            long ans = m; 
 
            // Process levels iteratively from bottom (n-1) to top (0)
            for (int i = n - 1; i >= 0; i--) {
                // Add all pieces of the current row to the active pool
                for (int j = 0; j < m; j++) {
                    int idx = Arrays.binarySearch(uniqueVals, a[i][j]);
                    st.update(1, 0, uniqueCount - 1, idx, a[i][j]);
                }
 
                // If total sum of available pieces is sufficient to break the current level
                if (st.sum[1] >= v[i]) {
                    long currentAns = st.query(1, 0, uniqueCount - 1, v[i]);
                    ans = Math.min(ans, currentAns);
                }
            }
            
            out.println(ans);
        }
        out.flush();
    }
 
    // Segment Tree definition
    static class SegTree {
        long[] sum;
        int[] count;
        long[] values;
 
        SegTree(int n, long[] uniqueValues) {
            sum = new long[4 * n];
            count = new int[4 * n];
            values = uniqueValues;
        }
 
        // Add a piece to the Segment Tree
        void update(int node, int start, int end, int idx, long val) {
            if (start == end) {
                count[node]++;
                sum[node] += val;
                return;
            }
            int mid = start + (end - start) / 2;
            if (idx <= mid) {
                update(2 * node, start, mid, idx, val);
            } else {
                update(2 * node + 1, mid + 1, end, idx, val);
            }
            sum[node] = sum[2 * node] + sum[2 * node + 1];
            count[node] = count[2 * node] + count[2 * node + 1];
        }
 
        // Query the minimum pieces needed to achieve 'req' damage
        long query(int node, int start, int end, long req) {
            if (start == end) {
                // Return ceiling integer division for pieces of exactly this value
                return (req + values[start] - 1) / values[start];
            }
            
            int mid = start + (end - start) / 2;
            long rightSum = sum[2 * node + 1];
            
            // Greedily take from the right child (larger values) first
            if (rightSum >= req) {
                return query(2 * node + 1, mid + 1, end, req);
            } else {
                // Exhaust the right child and fetch the remaining damage from the left
                return count[2 * node + 1] + query(2 * node, start, mid, req - rightSum);
            }
        }
    }
}