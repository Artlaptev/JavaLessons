import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

    }
    public static void deleteElements(ArrayList<Integer> array)
    {
        for (int item: array)
        {
            if(item %2==0)
                array.remove(item);
        }
    }
}
