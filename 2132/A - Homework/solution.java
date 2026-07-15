import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
 
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
 
            StringBuilder ans = new StringBuilder(a);
 
            for (int i = 0; i < m; i++) {
                char ch = b.charAt(i);
 
                if (c.charAt(i) == 'V') {
                    ans.insert(0, ch);   
                } else {
                    ans.append(ch);      
                }
            }
 
            System.out.println(ans.toString());
        }
    }
}