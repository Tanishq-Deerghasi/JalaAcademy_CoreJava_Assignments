public class HashMap {
    public static void main(String[] args) {
        
        java.util.HashMap<Integer, String> hashobj = new java.util.HashMap<>();


        //a. Inserting Student ID as Key & Name as value using put() method
        hashobj.put(1, "Sharan");
        hashobj.put(2, "Rohit");
        hashobj.put(3, "Leo");
        hashobj.put(4, "Keerthana");
        hashobj.put(5, "Aditya");
        hashobj.put(6, "Manoj");
        hashobj.put(7, "Mahideep");
        hashobj.put(8, "Prapul");
        hashobj.put(9, "Dheeraj");
        hashobj.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("Hash items = " + hashobj);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(hashobj.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap  : ");
        System.out.println(hashobj.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(hashobj.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(hashobj.containsValue("Sharan"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(hashobj.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(hashobj.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(hashobj.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        hashobj.remove(2, "Rohit");
        System.out.println(hashobj);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the jala to icfai :");

        java.util.HashMap<Integer, String> obj = new java.util.HashMap<>();

        obj.putAll(hashobj);
        System.out.println("obj = " + obj);
    }
}
