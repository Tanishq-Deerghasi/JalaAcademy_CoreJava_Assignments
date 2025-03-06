class Parent01 {
    String name = "Tanishq";

    Parent01() {
        System.out.println("This is parent class constructor");
    }
}

class Child01 extends Parent01 {
    String name = "Aditya";

    Child01() {
        super();
        System.out.println("This is child class constructor");
    }

    void printMethod() {
        System.out.println("My name is " + super.name);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child01 c = new Child01();
        c.printMethod();
    }
}