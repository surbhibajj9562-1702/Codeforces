import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int h = sc.nextInt();
            int m = sc.nextInt();
 
            int minutesLeft = 1440 - (h * 60 + m);
 
            System.out.println(minutesLeft);
        }
    }
}