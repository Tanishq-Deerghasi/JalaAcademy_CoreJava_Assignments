import java.io.*;
public class ReadFileReader {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("tanishq.txt");

            int i;
            
            while ((i = fr.read()) != -1) {
            
                System.out.print((char) i);
            }
            
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
