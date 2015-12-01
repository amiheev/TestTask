import java.util.List;

/**
 * Created by Alexey on 01.12.2015.
 */
// P = m/n , где m и n первые положительные числа в расположенные подряд
public class ValueOfP implements NumbersArrayOperation {

    @Override
    public Result action(List<Integer> list) {
        int m = 0;
        int n = 0;
        int p =0;
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) > 0){
                if (list.get(i+1) > 0){
                    m=list.get(i);
                    n=list.get(i+1);
                    break;
                }
            }
        }
        if (n!=0 && m!= 0){
            p = m / n;
        }

        return new ValueOfPResult(p, m, n);
    }

    static class ValueOfPResult implements Result{
        private int p;
        private int m;
        private int n;

        ValueOfPResult(int p, int m, int n) {
            this.p = p;
            this.m = m;
            this.n = n;
        }

        @Override
        public String toString() {
            return "ValueOfPResult{" +
                    "p= m / n " + m + " / " + n + " = " + p +  '}';
        }
    }
}
