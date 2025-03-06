public class CallThis {
    int num;
    String name;

    CallThis() {
        
        this(11, "Sharan");
    }

    CallThis(int num, String name) {
        
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        CallThis ob = new CallThis();
        CallThis ob1 = new CallThis(46, "Tanishq");
    }
}
