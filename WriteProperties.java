import java.io.FileOutputStream;
import java.util.Properties;

public class WriteProperties {
    public static void main(String args[]) {

        try {
            
            Properties props = new Properties();
            
            props.put("Name", "Tanishq");
            props.put("E.no", "356");
            props.put("College", "ADITYA");

            
            FileOutputStream outputStrem = new FileOutputStream("Tanishq_PropWrite.txt");
            
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
