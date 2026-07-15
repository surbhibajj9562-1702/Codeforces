import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int time = 240 - k;
        int solved = 0;
        int used = 0;
 
        for (int i = 1; i <= n; i++) {
            used += 5 * i;
 
            if (used <= time) {
                solved++;
            } else {
                break;
            }
        }
 
        System.out.println(solved);
    }
}