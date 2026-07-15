import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            int a = 0, b = 0, c = 0;
 
            for (char ch : s.toCharArray()) {
                if (ch == 'A') a++;
                else if (ch == 'B') b++;
                else c++;
            }
 
            if (b == a + c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}