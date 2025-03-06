import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteoutStream {
     public static void main(String args[]) {

        String data = "This text is written using OutputStream.";

        try {
           
            OutputStream fos = new FileOutputStream("tanishq_outstream.txt");

            
            byte[] db = data.getBytes();

            
            fos.write(db);
            System.out.println("Data is written to the file.");

            
            fos.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
