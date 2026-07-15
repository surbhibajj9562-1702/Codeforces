import java.util.*;
 
public class Main {
 
    static int getValue(int[] a) {
        int max = 0;
        int sum = 0;
        for (int x : a) {
            max = Math.max(max, x);
            sum += max;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int ans = getValue(a);
 
            // Try all swaps
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // swap
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
 
                    ans = Math.max(ans, getValue(a));
 
                    // swap back
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}