import java.util.Scanner;

public class Palindrome {
    static boolean palindromeNumber(int num) {
        int r, sum = 0, temp;

        temp = num;
        while (num > 0) {
            r = num % 10; 
            sum = (sum * 10) + r;
            num = num / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        //if(true)
        if (palindromeNumber(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}
