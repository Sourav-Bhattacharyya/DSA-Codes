package Test_Codes;
import java.util.Scanner;

class EvenSumPermutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int low = sc.nextInt();
        int high = sc.nextInt();
        int k = sc.nextInt();
        
        System.out.println(countEvenSumPermutations(low, high, k));
    }

    public static int countEvenSumPermutations(int low, int high, int k) {
        int evenCount = 0;
        int oddCount = 0;
        
        // Count evens and odds in the range [low, high]
        for (int i = low; i <= high; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int totalPermutations = 0;
        
        // We need to pick j even numbers and (k-j) odd numbers such that their sum is even
        for (int j = 0; j <= k; j++) {
            if (j <= evenCount && (k - j) <= oddCount) {
                if ((j % 2 == 0 && (k - j) % 2 == 0) || (j % 2 != 0 && (k - j) % 2 != 0)) {
                    totalPermutations += nCr(evenCount, j) * nCr(oddCount, k - j);
                }
            }
        }
        
        return totalPermutations;
    }
    
    public static int nCr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        r = Math.min(r, n - r);
        int num = 1, den = 1;
        for (int i = 0; i < r; i++) {
            num *= (n - i);
            den *= (i + 1);
        }
        return num / den;
    }
}
