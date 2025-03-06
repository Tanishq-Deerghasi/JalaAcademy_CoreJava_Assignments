import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNot {
     public static void main(String[] args) {

        try {
           
            BufferedReader reader = new BufferedReader(new FileReader(new File("c:/javaproj/demo.java")));
        }
        
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            
            e.printStackTrace();
        }
    }
}
