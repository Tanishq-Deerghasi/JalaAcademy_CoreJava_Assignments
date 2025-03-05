public class Create {
   
    void myMethod() {
        //This method returns nothing 
        String a = "This is a method in class Create";
        System.out.println(a);
    }

    public static void main(String[] args) {
        Create obj = new Create();
        obj.myMethod();
    }
}