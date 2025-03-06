public class ClassNotFound {
    public static void main(String[] args) {

        try {
            Class.forName("myClass");
            ClassLoader.getSystemClassLoader().loadClass("myClass");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
