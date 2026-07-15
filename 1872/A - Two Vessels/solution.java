import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            int diff = Math.abs(a - b);
 
            int ans = (diff + 2 * c - 1) / (2 * c);
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}