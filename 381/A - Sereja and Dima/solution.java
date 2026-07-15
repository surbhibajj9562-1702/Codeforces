import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int left = 0, right = n - 1;
        int sereja = 0, dima = 0;
        boolean serejaTurn = true;
 
        while (left <= right) {
            int pick;
 
            if (arr[left] > arr[right]) {
                pick = arr[left];
                left++;
            } else {
                pick = arr[right];
                right--;
            }
 
            if (serejaTurn) {
                sereja += pick;
            } else {
                dima += pick;
            }
 
            serejaTurn = !serejaTurn;
        }
 
        System.out.println(sereja + " " + dima);
    }
}