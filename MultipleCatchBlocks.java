public class MultipleCatchBlocks {
    public static void main(String[] args) {
        
        try {
            int[] a = new int[6];
        
            a[6] = 10 / 0;
            System.out.println(a[10]);
        }
        
        catch (java.lang.ArithmeticException e) {
        
            System.out.println("Arithmetic Exception occurs");
            e.getStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            e.getStackTrace();
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
            e.getStackTrace();
        }
        System.out.println("Main method ended");
    }
}
