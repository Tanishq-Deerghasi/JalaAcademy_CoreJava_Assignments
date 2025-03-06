class ParentClass_01 {
    String name;
    String branch;
    int rollNo;

    // Default constructor
    ParentClass_01() {
        // Default initialization if needed
    }

    // Constructor with roll number
    ParentClass_01(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No: " + this.rollNo);
    }

    // Constructor with name and branch
    ParentClass_01(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name: " + this.name + ", Branch: " + this.branch);
    }
}

class ChildClass_02 extends ParentClass_01 {
    String clg;
    String city;

    // Default constructor
    ChildClass_02() {
        super();
    }

    // Constructor with roll number
    ChildClass_02(int rollNo) {
        super(rollNo);
    }

    // Constructor with name, branch, college, and city
    ChildClass_02(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College: " + this.clg + ", City: " + this.city);
    }
}

public class CallSuperFromChild {
    public static void main(String... args) {
        // Creating objects and passing values
        new ChildClass_02();
        new ChildClass_02(225);
        new ChildClass_02("Tanishq", "BCA", "ADITYA", "Srikakulam");
    }
}