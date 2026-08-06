import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            long totalSum = 0;
            
            Map<Integer, Integer> freqMap = new HashMap<>();
            
            int maxFreq = 0;
            int maxFreqCard = -1;
            
            for (int i = 0; i < n; i++) {
                int card = scanner.nextInt();
                totalSum += card;
                
                int count = freqMap.getOrDefault(card, 0) + 1;
                freqMap.put(card, count);
                
                if (count > maxFreq) {
                    maxFreq = count;
                    maxFreqCard = card;
                }
            }
            
            int m = n - maxFreq;
            
            if (m >= maxFreq - 1) {
                System.out.println(totalSum);
            } 
            else {
                long otherSum = totalSum - (long) maxFreq * maxFreqCard;
                long maxDamage = otherSum + (long) (m + 2) * maxFreqCard;
                System.out.println(maxDamage);
            }
        }
        
        scanner.close();
    }
}