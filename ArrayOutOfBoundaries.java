public class ArrayOutOfBoundaries {
    public static void main(String[] args) {
        
        String[] arr = {"Tanishq", "Madhu", "Jack", "Arun"};
        
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            
            e.printStackTrace();
        }
    }
}
