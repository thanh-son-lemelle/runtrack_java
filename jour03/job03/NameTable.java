public class NameTable {
    public static void main(String[] args) {
        // Create a static array of strings named names in a contracted form
        String[] names = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(names[1]);
        // Replace the third element with "Mireille"
        names[2] = "Mireille";
        // Print the array using a for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }
    }
}
