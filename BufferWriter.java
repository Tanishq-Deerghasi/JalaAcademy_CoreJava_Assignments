import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {

        String s = "This text is written using BufferedWriter.";

        try {
            FileWriter fw = new FileWriter("Tanishq_BufferWrite.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            
            bw.write(s);
            
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
