import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
    /*
     * Ask user for a number and generate its multiplication table
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to generate its multiplication table: ");
    int number = scanner.nextInt();
    for (int i = 0; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }
    scanner.close();
}
}