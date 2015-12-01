import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 29.11.2015.
 */

// 4. Числа, которые делятся на 5 и на 7.
public class DivideBy5And7 implements NumbersArrayOperation  {

    @Override
    public Result action(List<Integer> list) {
        List<Integer> divideBy5And7 = new ArrayList<>();
        for (Integer i: list) {
            if (i % 5 == 0 && i % 7 == 0) {
                divideBy5And7.add(i);
            }
        }
        return new DivideBy5And7Result(divideBy5And7);
    }

    static class DivideBy5And7Result implements Result {
        private List<Integer> divideBy5And7;

        DivideBy5And7Result(List<Integer> divideBy5And7) {
            this.divideBy5And7 = divideBy5And7;
        }

        @Override
        public String toString() {
            return "DivideBy5And7Result{" +
                    "Divide by 5 and 7 =" + divideBy5And7 +
                    '}';
        }
    }
}
