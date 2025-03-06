import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
    public static void main(String args[]) {

        try {
            
            FileReader fr = new FileReader("tanishq.txt");
            BufferedReader br = new BufferedReader(fr);

            int i;
        
            while ((i = br.read()) != -1) {
            
                System.out.print((char) i);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
