import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
 
            int ans = 0;
 
            int[] candidates = {
                a1 + a2,
                a4 - a2,
                a5 - a4
            };
 
            for (int a3 : candidates) {
                int count = 0;
 
                if (a3 == a1 + a2) count++;
                if (a4 == a2 + a3) count++;
                if (a5 == a3 + a4) count++;
 
                ans = Math.max(ans, count);
            }
 
            System.out.println(ans);
        }
    }
}