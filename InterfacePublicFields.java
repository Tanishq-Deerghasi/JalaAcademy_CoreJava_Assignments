public interface InterfacePublicFields {
    int n = 150;
    public void myMethod();
}

class inf implements InterfacePublicFields {
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }
    public static void main(String[] args) {
        inf j = new inf();
        System.out.println(n);
        j.myMethod();
    }
}