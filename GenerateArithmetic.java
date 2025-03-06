
public class GenerateArithmetic {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            
            c = a / b;

            
        } catch (java.lang.ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            e.printStackTrace();
        }
    }
}
