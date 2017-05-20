import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> factors = Prime.PrimeFactorize(195);
        for(int i : factors) {
            System.out.println(i);
        }
    }
}
