import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(5);
        arr.add(21);
        System.out.println("Max="+getMax(arr)+"\nMin="+getMin(arr)+"\nMiddle="+getMiddle(arr));



    }
    public static int getMax(ArrayList<Integer> arr){
        int maxValue=-1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)>arr.get(i-1))
                maxValue= arr.get(i);
        }
        return maxValue;
    }
    public static int getMin(ArrayList<Integer> arr){
        int minValue=-1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i)<arr.get(i-1))
                minValue= arr.get(i);
        }
        return minValue;
    }
    public static double getMiddle(ArrayList<Integer> arr)
    {
        int sum=0;
        for (int i: arr
             ) {
            sum=sum+i;
        }
        return sum/arr.size();
    }
}
