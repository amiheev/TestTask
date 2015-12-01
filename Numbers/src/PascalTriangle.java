/**
 * Created by Alexey on 01.12.2015.
 */
import java.util.ArrayList;
import java.util.List;

// 15. Построить треугольник Паскаля для первого положительного числа.
public class PascalTriangle {

    public void action(List<Integer> list) {
        int rows = list.size();
        List<Integer> newList = new ArrayList<>();
        int positiveNumber = 0;
        for (Integer i : list){
            if (i > 0){
                positiveNumber=i;
                break;
            }
        }
        if (positiveNumber != 0 ) {
            newList.add(positiveNumber);
            System.out.println("Pascal Triangle:");
            System.out.println("[" + positiveNumber + "]");
            for (int i = 0; i < rows; i++){
                List<Integer> row = new ArrayList<>();
                row.add(newList.get(0));
                for (int j = 1; j <= i; j++){
                    row.add(newList.get(j-1) + newList.get(j));
                }
                row.add(newList.get(0));
                newList = row;
                System.out.println(row);

            }
        }
    }
}



