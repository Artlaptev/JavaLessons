public class Task3 {
    public static void main(String[] args) {
        int[] arr={ 1,3,5,5,6,3,3,7,8};
        int[] arrsorted=getSortedArray(arr,3);
        for (int i = 0; i < arrsorted.length; i++) {
            System.out.println(arrsorted[i]);
        }
    }

    public static int[] getSortedArray(int[] arr, int number) {

        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result[arr.length-1-j]=number;
                j++;
            }
            else{
                result[i-j]=arr[i];
            }
        }

        return result;
    }
}
