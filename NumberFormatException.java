public class NumberFormatException {
    
        public static void main(String[] args) {
    
            String str = "222ABC";
            try {
                // Converting string with inappropriate format
                int x = Integer.parseInt(str);
                int y = Integer.valueOf(str);
            } catch (java.lang.NumberFormatException e) {
                System.err.println("NumberFormatException caught!");
                e.printStackTrace();
            }
        }
        
}
