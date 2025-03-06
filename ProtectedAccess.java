
class Protected_Class {
    
    protected String name;
    protected void protected_Method() {
        System.out.println("This is a " + name);
    }
}
public class ProtectedAccess {
    public static void main(String[] args) {
        
        Protected_Class pc = new Protected_Class();
        pc.name = "My Protected Method";
        pc.protected_Method();
    }
}
