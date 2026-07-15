import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Step 1: sort array
            Arrays.sort(a);
            
            // Step 2: increase smallest element
            a[0]++;
            
            // Step 3: calculate product
            int product = 1;
            for (int i = 0; i < n; i++) {
                product *= a[i];
            }
            
            // Step 4: print result
            System.out.println(product);
        }
        
        sc.close();
    }
}