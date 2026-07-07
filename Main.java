import java.util.*;

public class Main {
    
    public static int getMthPrime(int m) {
        int count = 0;
        int num = 1;
        
        while (count < m) {
            num++;
            if (isPrime(num)){
                count++;
            }
        }
        return num;
    }
  
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        
        int m = getDigitSum(n);
        
        int mthPrime = getMthPrime(m);
        
        long secureToken = (long) mthPrime * m;
        
        System.out.println(secureToken);
    }
}