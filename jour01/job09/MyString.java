package job09;

public class MyString {
    public static void main(String[] args) {
        
        // 1. Using a string literal
        String str = "Hello World!";
        
        // 2. Using the new keyword
        String str2 = new String("Hello World!");

         // 3. Using a character array
         char[] charArray = {'J', 'a', 'v', 'a'};
         String str3 = new String(charArray);
 
         // 4. Using a byte array
         byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for 'Hello'
         String str4 = new String(byteArray);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
