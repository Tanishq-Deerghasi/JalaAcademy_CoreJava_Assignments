import java.util.Arrays;
import java.util.Scanner;

public class ContainsorNot {
      static void contains(int[] arr, int n1,int n2) {
        boolean num1 = false;
        boolean num2 = false;
        
        for (int i : arr) {
            if (i == n1) {
                num1 = true;
            }
            if (i==n2){
                num2 = true;
            }
        }
 
        if (num1) {
            System.out.printf("Contains %d in the array", n1);
        } else {
            System.out.printf("\nDoesn't Contain %d in the array", n1);
        }

        if (num2) {
            System.out.printf("\nContains %d in the array", n2);
        } else {
            System.out.printf("\nDoesn't Contain %d in the array", n2);
        }
        System.out.println("\nArray contains: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 12, 33, 44, 23, 55};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to verify (n1 & n2): ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //passing array and Elements to verify
        contains(my_arr, n1,n2);
    }
}
