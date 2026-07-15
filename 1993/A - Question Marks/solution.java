import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int a = 0, b = 0, c = 0, d = 0;
 
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'A') a++;
                else if (ch == 'B') b++;
                else if (ch == 'C') c++;
                else if (ch == 'D') d++;
            }
 
            int ans = Math.min(a, n) + Math.min(b, n) + Math.min(c, n) + Math.min(d, n);
            System.out.println(ans);
        }
    }
}