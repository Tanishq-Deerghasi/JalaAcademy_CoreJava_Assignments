class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        System.out.println(msg);
    }
}


public class OwnException {

    static void exam(int marks) throws InvalidMarksException {
        
        if (marks < 60) {
            throw new InvalidMarksException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
           
            exam(39);
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}
