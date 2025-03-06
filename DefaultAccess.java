
class ClassDefault {
    
    int myAge;
    String mySport;
    
    void methodDefault() {
        System.out.println("My Sport is " + mySport + " and my age is " + myAge);
    }
}

public class DefaultAccess {
    public static void main(String[] args) {
        
        ClassDefault obj = new ClassDefault();
        
        obj.myAge = 20;
        obj.mySport = "Cricket";
        obj.methodDefault();
    }
}
