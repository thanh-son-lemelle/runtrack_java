package job11;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        /*
         * Declare a variable of type int named minutes and assign it a value
         * Ask the user to enter the number of minutes and store it in the variable minutes
         * Convert the value of minutes to hours and minutes and print the result to the terminal
         */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hours as minutes: ");
    
    int minutes = sc.nextInt();
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;

    System.out.println(minutes + " minutes is equal to " + hours + " hours and " + remainingMinutes + " minutes");     
    sc.close();
    }
}
