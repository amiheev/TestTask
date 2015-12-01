import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alexey on 28.11.2015.
 */
// 9. Отсортированные числа в порядке возрастания и убывания.
public class NumbersSort implements NumbersArrayOperation{

    @Override
    public Result action(List<Integer> list) {
        List<Integer> byAsc = new ArrayList<>(list);
        Collections.sort(byAsc);
        List<Integer> byDesc = new ArrayList<>(byAsc);
        Collections.reverse(byDesc);


        return new NumberSortResult(byAsc, byDesc);
    }

    static class NumberSortResult implements Result{
        private List<Integer> sortedListAsc;
        private List<Integer> sortedListDesc;

        NumberSortResult(List<Integer> sortedListAsc, List<Integer> sortedListDesc) {
            this.sortedListAsc = sortedListAsc;
            this.sortedListDesc = sortedListDesc;
        }

        @Override
        public String toString() {
            return "ArraySortResult{" +
                    "Числа отсортированные по возрастанию=" + sortedListAsc +
                    ", Числа отсортированные по убыванию=" + sortedListDesc +
                    '}';
        }
    }
}
