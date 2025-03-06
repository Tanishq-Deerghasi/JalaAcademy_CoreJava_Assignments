import java.io.FileInputStream;
import java.io.InputStream;

public class ReadInputStream {
    public static void main(String[] args) {

        try {
            
            InputStream fis = new FileInputStream("tanishq.txt");
            int i;
            
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            
            fis.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
