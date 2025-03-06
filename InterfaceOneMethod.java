interface Interface01 {
    void oneMethod();
}

public class InterfaceOneMethod implements Interface01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod inf = new InterfaceOneMethod();
        inf.oneMethod();
    }
}