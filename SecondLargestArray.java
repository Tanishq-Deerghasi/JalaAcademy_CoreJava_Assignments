import java.util.Arrays;

public class SecondLargestArray {
   static void secondLargest(int[] arr) {
        int temp;
        //outer loop
        for (int i = 0; i < arr.length; i++) {
            //inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in Array : " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55};
        System.out.println("arr[] = " + Arrays.toString(my_arr));
        secondLargest(my_arr);
    } 
}
