public class Variables {
    int a = 40;
    void local() {
        int a = 50;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.println("Instance variable a : " + obj.a);
        obj.local();
    }
}
