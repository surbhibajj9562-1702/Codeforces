import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
 
            int[] a = new int[n];
            int mx = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mx = Math.max(mx, a[i]);
            }
 
            if (k > 1) {
                System.out.println("YES");
            } else {
                if (a[j - 1] == mx) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
 
        sc.close();
    }
}