import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {

        System.out.print("Enter a Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        
        char Gender = sc.next().charAt(0);
        
        switch (Gender) {
            
            case 'M':
            case 'm':
                System.out.println("Gender is Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender is Female");
                break;
        }
    }
}
