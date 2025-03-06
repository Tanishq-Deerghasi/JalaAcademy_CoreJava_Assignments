
    class A {
        int n = 11;
    
        void methodA1() {
            System.out.println("This is Class A Method 1");
        }
    
        void methodA2() {
            System.out.println("This is Class A Method 2");
        }
    
        void method3() {
            System.out.println("This is override method - Class A");
        }
    }
    
    //subclass of A
    class B extends A {
        int n = 22;
    
        void methodB1() {
            System.out.println("This is Class B Method 1");
        }
    
        void methodB2() {
            System.out.println("This is Class B Method 2");
        }
    
        @Override 
        void method3() {
            System.out.println("This is override method - Class B");
        }
    }
    
    //subclass of B
    class C extends B {
        int n = 33;
    
        void methodC1() {
            System.out.println("This is Class C Method 1");
        }
    
        void methodC2() {
            System.out.println("This is Class C Method 2");
        }
    
        @Override  //override method
        void method3() {
            System.out.println("This is override method - Class C");
        }
    }
    
    //class with main method
    public class Inheritance {
        public static void main(String[] args) {
   
            A a = new A();
            a.methodA1();
            a.methodA2();
            a.method3();
            
            B b = new B();
            b.methodB1();
            b.methodB2();
            b.method3();
            
            C c = new C();
            c.methodC1();
            c.methodC2();
            c.method3();
    
            
            A override_method = new B();
            override_method.method3();
            override_method = new C();
            override_method.method3();
    
            A run_time = new A();
            System.out.println(run_time.n);
            run_time = new B();
            System.out.println(run_time.n);
            run_time = new C();
            System.out.println(run_time.n);
    
          
        }
}
