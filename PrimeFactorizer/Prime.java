import java.util.LinkedList;
import java.util.List;

public class Prime {

    public static boolean isPrime(int a) {
        if(a == 2) return true;
        if(a % 2 == 0) return false;
        if(a == 1) return false;

        for(int i = 3; i < Math.floor(a/2); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> PrimeFactorize(int a) {
        List<Integer> factors = new LinkedList<>();

        int i = 0;
        while(i < a && multiplyFactors(factors) != a) {
            if (isPrime(i) && a % i == 0) {
                factors.add(i);
            }
            i++;
        }

        return factors;
    }

    public static int multiplyFactors(List<Integer> factors) {
        int a = 0;
        for(int i : factors) a += i;
        return a;
    }

}
