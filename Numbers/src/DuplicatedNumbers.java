import java.util.*;

/**
 * Created by Alexey on 01.12.2015.
 */

 // 10. Числа в порядке убывания частоты встречаемости чисел.
public class DuplicatedNumbers implements NumbersArrayOperation {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        sortByFrequency(newList);
        Collections.reverse(newList);
        return new DuplicatedNumbersResult(newList);
    }


    private void sortByFrequency(final List<Integer> list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Collections.frequency(list, o1) - Collections.frequency(list, o2);
            }
        });

    }
    static class DuplicatedNumbersResult implements Result{
        List<Integer> sortedByDuplicatedCount;

        DuplicatedNumbersResult(List<Integer> sortedByDuplicatedCount) {
            this.sortedByDuplicatedCount = sortedByDuplicatedCount;
        }

        @Override
        public String toString() {
            return "DuplicatedNumbersResult{" +
                    "sortedByDuplicatedCount=" + sortedByDuplicatedCount +
                    '}';
        }
    }
}
