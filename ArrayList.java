import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {
     public static void main(String[] args) {

       
        java.util.ArrayList<String> Numbers = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\nNumbers = " + Numbers);

        //a. adding elements to the ArrayList using add method using add() method
        Numbers.add("six");
        Numbers.add("seven");
        Numbers.add("eight");
        Numbers.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("Numbers = " + Numbers);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = Numbers.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        Numbers.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("Numbers = " + Numbers);

        //d. Removing an element at a specific index using remove() method
        Numbers.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("Numbers = " + Numbers);

        //e. Updating the element at a specific index using set() method
        Numbers.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("Numbers = " + Numbers);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(Numbers.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(Numbers.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(Numbers.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(Numbers.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        Numbers.clear();
        System.out.println("Numbers = " + Numbers);
    }
}
