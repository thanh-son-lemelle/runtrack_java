package job13;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}