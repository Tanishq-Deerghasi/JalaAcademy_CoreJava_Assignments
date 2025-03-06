public class MethodOverloading {
    int rollNo;
    String name;
    int n1;
    int n2;
    
    void method1(int num1) {
        this.n1 = num1;
        System.out.println("1.First number : " + num1);
    }

    void method1(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
        System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }

    
    void method2(int rollNo) {
        this.rollNo = rollNo;  //Integer
        System.out.println("2.Roll number : " + rollNo);
    }
    
    void method2(int rollNo, String name) {
        this.rollNo = rollNo; //Integer
        this.name = name;     //String
        System.out.println("2.Roll number : " + rollNo + " ; " + "Name : " + name);
    }

    
    void method4(int rollNo) {
        this.rollNo = rollNo;  //Integer data type
        System.out.println("4.Roll number : " + rollNo);
    }
    

    void method4(String name) {
        this.name = name;   //String
        System.out.println("4.Name : " + name);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        
        obj.method1(11);
        obj.method1(10, 20);

        
        obj.method2(317);
        obj.method2(317, "Tanishq");

        
        obj.method4(317);
        obj.method4("Tanishq");
    }
}
