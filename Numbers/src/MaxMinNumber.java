import com.sun.javafx.collections.transformation.SortedList;

import java.util.Collections;
import java.util.List;

/**
 * Created by Alexey on 28.11.2015.
 */

// 2. Наибольшее и наименьшее число.
public class MaxMinNumber implements NumbersArrayOperation {

  @Override
    public Result action(List<Integer> list) {
        int min;
        int max;
        max = list.get(0);
        min = list.get(0);
        if (list.size() > 1) {
            for (int i =1; i < list.size(); i++){
                if (list.get(i) > max) {
                    max = list.get(i);
                }
                if (list.get(i) < min){
                    min = list.get(i);
                }
            }
        }

        return new MaxMinNumberResult(min, max);
    }
    static class MaxMinNumberResult implements Result {
        int min;
        int max;
        public MaxMinNumberResult(int min, int max){
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return "MaxMinNumberResult{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }
}
