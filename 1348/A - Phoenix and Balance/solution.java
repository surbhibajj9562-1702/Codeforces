import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int pile1 = 0;
            int pile2 = 0;
 
            // pile1: largest coin
            pile1 += (1 << n);
 
            // add smallest (n/2 - 1) coins
            for (int i = 1; i < n / 2; i++) {
                pile1 += (1 << i);
            }
 
            // pile2: remaining coins
            for (int i = n / 2; i < n; i++) {
                pile2 += (1 << i);
            }
 
            System.out.println(Math.abs(pile1 - pile2));
        }
    }
}