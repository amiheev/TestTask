import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 30.11.2015.
 */
// 6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
public class NumberWithDifferentDigits implements NumbersArrayOperation {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> unique = new ArrayList<>();
        for (Integer i : list){
            if (i >= 100 && i <= 999){
                String num = i.toString();
                if (num.charAt(0) != num.charAt(1) && num.charAt(1) != num.charAt(2) && num.charAt(0) != num.charAt(2)){
                    unique.add(i);
                }
            }
        }
        return new NumberWithDifferentDigitsResult(unique);
    }

    static class NumberWithDifferentDigitsResult implements Result {
        private List<Integer> resultList;

        NumberWithDifferentDigitsResult(List<Integer> resultList) {
            this.resultList = resultList;
        }

        @Override
        public String toString() {
            return "NumberWithDifferentDigitsResult{" +
                    "Все трехзначные числа, в десятичной записи которых нет одинаковых цифр =" + resultList +
                    '}';
        }
    }
}
