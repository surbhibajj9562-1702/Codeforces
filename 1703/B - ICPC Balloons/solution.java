import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            boolean[] seen = new boolean[26]; // A-Z
            int balloons = 0;
            
            for (char c : s.toCharArray()) {
                int index = c - 'A';
                
                if (!seen[index]) {
                    balloons += 2; // first time
                    seen[index] = true;
                } else {
                    balloons += 1; // already solved
                }
            }
            
            System.out.println(balloons);
        }
        
        sc.close();
    }
}