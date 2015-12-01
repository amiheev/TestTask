import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 01.12.2015.
 */

//13. Элементы, которые равны полусумме соседних элементов.
public class EqualHalfSumOfNeighboring  implements NumbersArrayOperation{
    @Override
    public Result action(List<Integer> list) {
        List<Integer> listEHSON = new ArrayList<>();
        for (int i = 1; i < list.size()-1; i++){
            if (list.get(i).equals(list.get(i-1) / 2 + list.get(i+1) / 2)){
                listEHSON.add(list.get(i));
            }
        }
        return new EqualHalfSumOfNeighboringResult(listEHSON);
    }

    static class EqualHalfSumOfNeighboringResult implements Result {
        private List<Integer> numbersEqualsHalfSumOfNeighboring;

        EqualHalfSumOfNeighboringResult(List<Integer> numbersEqualsHalfSumOfNeighboring) {
            this.numbersEqualsHalfSumOfNeighboring = numbersEqualsHalfSumOfNeighboring;
        }

        @Override
        public String toString() {
            return "EqualHalfSumOfNeighboringResult{" +
                    "Число равное полусумме соседних=" + numbersEqualsHalfSumOfNeighboring +
                    '}';
        }
    }

}
