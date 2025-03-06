interface Interface01 {
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

public class Default_Interface implements Interface01 {
    public static void main(String[] args) {
    
        Default_Interface inf = new Default_Interface();
        inf.defaultMethod();
    }
}
