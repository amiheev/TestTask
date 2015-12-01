import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 01.12.2015.
 */
// 11. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
public class FibonacciNumbers implements NumbersArrayOperation {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> fibList = new ArrayList<>();
        for (Integer i : list){
            if (isFibonacci(i)){
                fibList.add(i);
            }
        }
        return new FibonacciNumbersResult(fibList);
    }

    private boolean isFibonacci(int num){
            List<Integer> buffer = new ArrayList<>();
            Integer next = new Integer("1");
            Integer second = new Integer("1");
            Integer prom;
            buffer.add(next);
            while (next.compareTo(num) < 0) {
                prom = second + 0;
                second = next + second;
                next = prom;
            }
            return next.compareTo(num) == 0;
    }

    static class FibonacciNumbersResult implements Result {
        List<Integer> fibonacciList;

        FibonacciNumbersResult(List<Integer> fibonaciList) {
            this.fibonacciList = fibonacciList;
        }

        @Override
        public String toString() {
            return "FibonacciNumbersResult{" +
                    "Числа Фибоначи =" + fibonacciList +
                    '}';
        }
    }
}
