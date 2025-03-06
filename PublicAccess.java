class ourPublic {
    
    public String pvarName = "Public";
    public void publicMethod() {
        System.out.println("This is " + pvarName);
    }
}

public class PublicAccess {
    public static void main(String[] args) {

        ourPublic public_var = new ourPublic();
        public_var.pvarName = "Public Method";
        public_var.publicMethod();
    }
}
