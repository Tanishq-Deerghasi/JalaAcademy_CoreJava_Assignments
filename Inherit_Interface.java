interface Interface1 {
    void method_1();
}

interface Interface2 extends Interface1 {
    void method_2();
}

class InheritInterface implements Interface2 {
    
    @Override
    public void method_1() {
        System.out.println("This is first method");
    }
    
    @Override
    public void method_2() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        
        InheritInterface if7 = new InheritInterface();
        
        if7.method_1();
        if7.method_2();
    }
}