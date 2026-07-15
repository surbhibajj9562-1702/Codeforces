import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader(System.in);
        int n = fr.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fr.nextInt();
        }
 
        // Map to store frequency of numbers we've already processed
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
 
        for (int val : a) {
            // Check all possible powers of 2 up to 2^31
            for (int i = 1; i <= 31; i++) {
                long powerOfTwo = 1L << i;
                int target = (int) (powerOfTwo - val);
                
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
            // Add current value to map after checking to avoid i < j constraint issues
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
 
        System.out.println(count);
    }
 
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
    }
}