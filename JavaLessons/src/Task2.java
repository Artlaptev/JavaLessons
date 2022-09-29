import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] myar = {
            1, 1, 1, 0, 1, 1, 0, 1, 1
        } ;
        int[] resultarr=getMaxQtyOnes(myar);
        for (int i = 0; i < resultarr.length; i++) {
            System.out.println(resultarr[i]);
        }

    }

    public static int[] getMaxQtyOnes(int[] array) {
        int qty = 0;
        ArrayList<Integer> cache = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) continue;
            if (array[i] == 1 && array[i - 1] == 1) qty++;
            else {
                qty++;
                cache.add(qty);
                qty = 0;
            }
        }
        int[] result = new int[Collections.max(cache)];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        return result;
    }
}
