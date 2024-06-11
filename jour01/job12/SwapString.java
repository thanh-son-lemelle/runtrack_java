package job12;
import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        /*
         * Declare two variables of type String named firstString and secondString
         * Ask the user to enter two strings and store them in the variables firstString and secondString
         * Swap the values of the variables using substring method
         * substring method is used to extract a part of a string
         * Print the new values of the variables to the terminal
         */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = sc.nextLine();

        System.out.println("Before swapping: ");
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);

        firstString = firstString + secondString;
        secondString = firstString.substring(0, firstString.length() - secondString.length());
        firstString = firstString.substring(secondString.length());

        System.out.println("After swapping: ");
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);

        sc.close();
    }
}
