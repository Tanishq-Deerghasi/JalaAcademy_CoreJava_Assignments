public class BigSmall {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        System.out.println("Smaller Number is " + min);
        System.out.println("Larger Number is " + max);
    }
}
