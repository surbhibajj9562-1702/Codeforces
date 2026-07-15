import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[][] grid = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < n; j++) {
                    grid[i][j] = row.charAt(j) - '0';
                }
            }
            
            // Reduced grid
            for (int i = 0; i < n; i += k) {
                for (int j = 0; j < n; j += k) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}