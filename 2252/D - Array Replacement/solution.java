import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            // Edge case: array of length 1 requires no operations
            if (n == 1) {
                out.println(a[0]);
                continue;
            }
            
            // 1. Build the difference array
            long[] d = new long[n - 1];
            for (int i = 0; i < n - 1; i++) {
                d[i] = a[i+1] - a[i];
            }
            
            // 2. Group contiguous elements by parity and sort them
            int i = 0;
            while (i < n - 1) {
                int j = i;
                // Group differences with the same parity
                // Using Math.abs to handle negative remainders correctly in Java
                while (j < n - 1 && Math.abs(d[j] % 2) == Math.abs(d[i] % 2)) {
                    j++;
                }
                
                // Sort the contiguous block of same-parity differences
                Arrays.sort(d, i, j);
                i = j;
            }
            
            // 3. Reconstruct and print the array
            out.print(a[0] + " ");
            for (int k = 1; k < n; k++) {
                a[k] = a[k-1] + d[k-1];
                out.print(a[k] + (k == n - 1 ? "" : " "));
            }
            out.println();
        }
        
        // Flush the output buffer
        out.flush();
    }
    
    // Fast I/O Template to prevent Time Limit Exceeded (TLE)
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
}