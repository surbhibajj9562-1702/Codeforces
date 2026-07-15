import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
            char c = sc.next().charAt(0);
 
            boolean possible = false;
 
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) == c) {
                    possible = true;
                    break;
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
 
        sc.close();
    }
}