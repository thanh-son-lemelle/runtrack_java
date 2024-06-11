package job10;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        /* 
         * Declare two variables of type String named firstName and lastName
         * Ask the user to enter their first name and store it in the variable firstName
         * Ask the user to enter their last name and store it in the variable lastName
         * Print the full name of the user to the terminal
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Full name: " + firstName + " " + lastName);

        sc.close();
    }

}
