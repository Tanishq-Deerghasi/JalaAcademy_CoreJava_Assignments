import java.util.Iterator;
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> hashobj = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        hashobj.add("zero");
        hashobj.add("one");
        hashobj.add("two");
        hashobj.add("three");
        hashobj.add("four");
        hashobj.add("five");
        hashobj.add("six");
        hashobj.add("seven");
        hashobj.add("eight");
        hashobj.add("nine");
        hashobj.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        hashobj.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("jala = " + hashobj);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = hashobj.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(hashobj.clone());

        //c. Removing a specific element using remove() method
        hashobj.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("items = " + hashobj);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(hashobj.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(hashobj.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(hashobj.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        hashobj.clear();
        System.out.println("items= " + hashobj);
    }
}