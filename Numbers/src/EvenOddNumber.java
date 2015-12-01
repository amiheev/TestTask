import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexey on 28.11.2015.
 */
// 1. Четные и нечетные числа.
public class EvenOddNumber implements NumbersArrayOperation{

    @Override
    public Result action(List<Integer> list) {
        List<Integer> oddNumber = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer i: list){
            if (i % 2 == 0){
                evenNumber.add(i);
            }else oddNumber.add(i);
        }
        return new EvenOddNumberResult(evenNumber, oddNumber);
    }

    static class EvenOddNumberResult implements Result {
        List<Integer> oddNumber;
        List<Integer> evenNumber;

        EvenOddNumberResult(List<Integer> evenNumber, List<Integer> oddNumber){
            this.evenNumber = evenNumber;
            this.oddNumber = oddNumber;
        }

        @Override
        public String toString() {
            return "EvenOddNumberResult{" +
                    "oddNumber=" + oddNumber +
                    ", evenNumber=" + evenNumber +
                    '}';
        }
    }
}
