class Parent01 {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        this.method1();
    }
}
//SubClass
class Child01 extends Parent01 {
    void method3() {
        super.method2();
    }
}

public class ThisSuperMethods {
    public static void main(String[] args) {
        Child01 c = new Child01();
        c.method3();
    }    
}
