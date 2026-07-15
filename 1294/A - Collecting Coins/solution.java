import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();
 
            long mx = Math.max(a, Math.max(b, c));
            long need = (mx - a) + (mx - b) + (mx - c);
 
            if (n >= need && (n - need) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}