import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInput {
       public static void main(String[] args) {

        try {
           
            FileInputStream fis = new FileInputStream("tanishq.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            
            bis.close();
            fis.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
