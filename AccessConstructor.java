public class AccessConstructor {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    
    AccessConstructor() {
        this(11);
    }

    
    public  AccessConstructor(int rollNo) {
        this("Tanishq");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    
    private  AccessConstructor(String name) {
        this("ADITYA", "Srikakulam");
        this.name = name;
        System.out.println("Name : " + name);
    }

    
    protected  AccessConstructor(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        AccessConstructor c = new  AccessConstructor();
    }
}
