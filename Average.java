public class Average {
    static void calcAvg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int avg = sum / arr.length;
        System.out.print("The Average of array is " + avg);
    }

    public static void main(String[] args) {
        
        int[] arr = {34,56,4,34,45,6};
        calcAvg(arr);
    }
}
