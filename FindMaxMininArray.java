import java.util.Arrays;

public class FindMaxMininArray {
    static void Min_Max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
        
            if (arr[i] > max) {
                max = arr[i];
            
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
            
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
    }

    public static void main(String[] args) {
        
        int[] my_arr = {11, 22, 33, 44, 55};
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        Min_Max(my_arr);
    }
}
