import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alexey on 28.11.2015.
 */
public class IntegerArrayTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IntegerArray array = new IntegerArray();
        List<Integer> numbers = array.getArray();
        System.out.println("Ограничения — символ должен быть целым числом и число не должно быть больше чем 2147483647 и меньше чем -2147483648");
        while (array.getArray().size() < 8) {
            System.out.println("введите целое число");
            try {
                array.addNumber(sc.nextInt());
            } catch (InputMismatchException e) {
                String err = e.getMessage();
                System.out.println(err + " некорректное число \n"
                + "программа будет завершена");
                return;
            }
        }
        List<Result> list = new ArrayList<Result>() ;
        list.add(new MaxMinNumber().action(numbers));
        list.add(new EvenOddNumber().action(numbers));
        list.add(new DivideBy3OR9().action(numbers));
        list.add(new DivideBy5And7().action(numbers));
        list.add(new SortedByModule().action(numbers));
        list.add(new NumberWithDifferentDigits().action(numbers));
        list.add(new GreatestCommonDivisorAndLeastCommonMultiple().action(numbers));
        list.add(new PrimeNumbers().action(numbers));
        list.add(new NumbersSort().action(numbers));
        list.add(new DuplicatedNumbers().action(numbers));
        list.add(new FibonacciNumbers().action(numbers));
        list.add(new PalindromeNumbers().action(numbers));
        list.add(new EqualHalfSumOfNeighboring().action(numbers));
        list.add(new ValueOfP().action(numbers));
        for (Result result : list){
            System.out.println(result);
        }
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.action(numbers);
    }
}
