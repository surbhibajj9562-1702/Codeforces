import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
 
        int n = Math.min(A, B);
 
        long fact = 1;
 
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
 
        System.out.println(fact);
    }
}