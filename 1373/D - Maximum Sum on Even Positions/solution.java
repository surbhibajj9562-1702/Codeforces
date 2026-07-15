import java.util.*;
 
public class Main {
 
    static long kadane(ArrayList<Long> arr) {
        long maxSum = 0;
        long current = 0;
 
        for (long x : arr) {
            current = Math.max(x, current + x);
            maxSum = Math.max(maxSum, current);
        }
 
        return maxSum;
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
 
            long base = 0;
 
            for (int i = 0; i < n; i += 2)
                base += a[i];
 
            ArrayList<Long> gain1 = new ArrayList<>();
            ArrayList<Long> gain2 = new ArrayList<>();
 
            for (int i = 0; i + 1 < n; i += 2)
                gain1.add(a[i + 1] - a[i]);
 
            for (int i = 1; i + 1 < n; i += 2)
                gain2.add(a[i] - a[i + 1]);
 
            long ans = base + Math.max(kadane(gain1), kadane(gain2));
 
            System.out.println(ans);
        }
    }
}