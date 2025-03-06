import java.io.FileWriter;

public class FileWrite {
     public static void main(String[] args) {

        String s = "This text is written using FileWriter.";

        try {
            
            FileWriter fw = new FileWriter("Tanishq_filewrite.txt");

            
            fw.write(s);
            
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
