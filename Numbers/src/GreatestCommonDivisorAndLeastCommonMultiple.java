import java.util.List;

/**
 * Created by Alexey on 30.11.2015.
 */

// 7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
public class GreatestCommonDivisorAndLeastCommonMultiple implements NumbersArrayOperation {
    public int getGCD(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return getGCD(b, x);
    }

    public int getLCM(int a,int b){
        return a / getGCD(a, b) * b;
    }

    @Override
    public Result action(List<Integer> list) {
        int gcd = list.get(0);
        for (int i = 1; i < list.size(); i++){
            gcd = getGCD(gcd, list.get(i));
        }
        int lcm = list.get(0);
        for (int i = 1; i < list.size(); i++){
            lcm = getLCM(lcm, list.get(i));
        }
        return new GreatestCommonDivisorAndLeastCommonMultipleResult(gcd, lcm);
    }

    static class GreatestCommonDivisorAndLeastCommonMultipleResult implements Result {
        private int gcd;
        private int lcm;

        GreatestCommonDivisorAndLeastCommonMultipleResult(int gcd, int lcm) {
            this.gcd = gcd;
            this.lcm = lcm;
        }

        @Override
        public String toString() {
            return "GreatestCommonDivisorAndLeastCommonMultipleResult {" +
                    "Наибольший общий делитель=" + gcd +
                    ", Наименьшее общее кратное=" + lcm +
                    '}';
        }
    }


}
