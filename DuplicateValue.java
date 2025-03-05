import java.util.Arrays;

public class DuplicateValue {
     static void find_duplicate(int[] arr) {
        System.out.println("Duplicate values : ");
        for (int i = 0; i < arr.length - 1; i++) {
            //inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] && (i != j))) {
                    //prints the duplicate element
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int[] my_arr = {11, 22, 33, 44, 55, 22, 44, 33};
        
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        find_duplicate(my_arr);
    }
}
