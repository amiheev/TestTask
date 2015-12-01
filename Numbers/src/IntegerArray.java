import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 28.11.2015.
 */
public class IntegerArray {
    private List<Integer> array;

    public IntegerArray(){
        this.array = new ArrayList<Integer>();
    }

    public List<Integer> getArray() {
        return array;
    }

    public boolean addNumber(int i){
        return array.add(i);
    }
}
