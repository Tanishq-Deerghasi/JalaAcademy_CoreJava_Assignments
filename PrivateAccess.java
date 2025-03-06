public class PrivateAccess {
    private String sport = "Cricket";
    private int age = 21;

    private void pvt_Method() {
        System.out.println("My Sport is " + sport + " and my age is " + age);
    }

    
    public static void main(String[] args) {
        PrivateAccess obj = new PrivateAccess();
        
        System.out.println(obj.age);
        System.out.println(obj.sport);

        obj.pvt_Method();
    }
}
