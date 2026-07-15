import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int s = sc.nextInt();
                StringBuilder sb = new StringBuilder();
                
                for (int d = 9; d >= 1; d--) {
                    if (s >= d) {
                        sb.append(d);
                        s -= d;
                    }
                }
                
                System.out.println(sb.reverse().toString());
            }
        }
        sc.close();
    }
}