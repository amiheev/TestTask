import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 01.12.2015.
 */
//12. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
public class PalindromeNumbers implements NumbersArrayOperation {
    @Override
    public Result action(List<Integer> list) {
        List<Integer> palindromeList = new ArrayList<>();
        for (Integer i : list){
                if (i.equals(isPalindrome(i))){
                    palindromeList.add(i);
                }

        }
        return new PalindromeNumbersResult(palindromeList);
    }

    private int isPalindrome(Integer num){
        Integer reverse = 0;
        while (num != 0){
            reverse=reverse * 10 + num%10;
            num = num / 10;
        }
        return reverse;
    }

    static class PalindromeNumbersResult implements Result {
        List<Integer> palindromeList;
        PalindromeNumbersResult(List<Integer> palindromeList) {
            this.palindromeList = palindromeList;
        }
        @Override
        public String toString() {
            return "PalindromeNumbersResult{" +
                    "palindromeList=" + palindromeList +
                    '}';
        }
    }
}
