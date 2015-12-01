import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 29.11.2015.
 */

// 3. Числа, которые делятся на 3 или на 9.
public class DivideBy3OR9 implements NumbersArrayOperation  {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> divideBy3OR9List = new ArrayList<>();
        for (Integer i: list){
            if (i % 9 == 0){
                divideBy3OR9List.add(i);
            }else if (i % 3 == 0){
                divideBy3OR9List.add(i);
            }
        }
        return new DivideBy3OR9Result(divideBy3OR9List);
    }
    static class DivideBy3OR9Result implements Result {
        private List<Integer> divideBy3OR9List;

        DivideBy3OR9Result(List<Integer> divideBy3OR9List) {
            this.divideBy3OR9List = divideBy3OR9List;
        }

        @Override
        public String toString() {
            return "DivideBy3OR9Result{" +
                    "Divide by 3 or 9 =" + divideBy3OR9List +
                    '}';
        }
    }
}
