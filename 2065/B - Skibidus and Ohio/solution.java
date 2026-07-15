import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
            boolean hasPair = false;
 
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    hasPair = true;
                    break;
                }
            }
 
            if (hasPair)
                System.out.println(1);
            else
                System.out.println(s.length());
        }
    }
}