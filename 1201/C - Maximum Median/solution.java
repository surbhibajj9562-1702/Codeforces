import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader(System.in);
        int n = fr.nextInt();
        long k = fr.nextLong();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nextInt();
        }
        
        // Step 1: Sort the array to find the median
        Arrays.sort(a);
        
        int medianIndex = n / 2;
        
        // Step 2: Binary Search for the maximum possible median
        // Range: Current median value to current median + k
        long low = a[medianIndex];
        long high = 2000000000L; // Max value of a[i] (1e9) + max k (1e9)
        long result = low;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (canAchieve(mid, a, medianIndex, k)) {
                result = mid;
                low = mid + 1; // Try for a larger median
            } else {
                high = mid - 1; // Need a smaller median
            }
        }
        
        System.out.println(result);
    }
    
    // Check function to see if 'target' can be the median with k operations
    private static boolean canAchieve(long target, int[] a, int medianIndex, long k) {
        long neededOperations = 0;
        for (int i = medianIndex; i < a.length; i++) {
            if (target > a[i]) {
                neededOperations += (target - a[i]);
            }
            // Optimization: Stop if we've already exceeded k
            if (neededOperations > k) return false;
        }
        return neededOperations <= k;
    }
 
    // Fast I/O Class for competitive programming
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
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
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}