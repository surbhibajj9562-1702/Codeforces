import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            boolean ok = true;
 
            int oddParity = a[0] % 2;   // parity at odd index positions (1-based)
            int evenParity = a[1] % 2;  // parity at even index positions (1-based)
 
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { // odd position in 1-based indexing
                    if (a[i] % 2 != oddParity) {
                        ok = false;
                        break;
                    }
                } else { // even position
                    if (a[i] % 2 != evenParity) {
                        ok = false;
                        break;
                    }
                }
            }
 
            System.out.println(ok ? "YES" : "NO");
        }
 
        sc.close();
    }
}