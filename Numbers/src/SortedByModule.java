import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alexey on 30.11.2015.
 */

// 5. Элементы, отсортированные по убыванию модулей.
public class SortedByModule  implements NumbersArrayOperation, Comparator<Integer>{

    @Override
    public Result action(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        Collections.sort(newList, new SortedByModule());
        Collections.reverse(newList);
        return new SortedByModuleResult(newList);
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        Integer i1 = Math.abs(o1);
        Integer i2 = Math.abs(o2);
        return i1.compareTo(i2);
    }

    static class SortedByModuleResult implements Result {
        private List<Integer> sortedList;

        SortedByModuleResult(List<Integer> sortedList) {
            this.sortedList = sortedList;
        }

        @Override
        public String toString() {
            return "SortedByModuleResult{" +
                    "Числа отсротированные впорядке убывания их модулей=" + sortedList +
                    '}';
        }
    }
}