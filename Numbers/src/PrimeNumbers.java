import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 30.11.2015.
 */

// 8. Простые числа.
public class PrimeNumbers implements NumbersArrayOperation {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> prime = new ArrayList<>();
        for (Integer i : list){
            if (isPrime(i)){
                prime.add(i);
            }
        }
        return new PrimeNumbersResult(prime);
    }

    boolean isPrime(int num) {
        if (num > 0){
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }


        }else return false;
        return true;
    }

    static class PrimeNumbersResult implements Result {
        private List<Integer> primeNumbersList;

        PrimeNumbersResult(List<Integer> primeNumbersList) {
            this.primeNumbersList = primeNumbersList;
        }

        @Override
        public String toString() {
            return "PrimeNumbersResult{" +
                    "Простые числа=" + primeNumbersList +
                    '}';
        }
    }



}
