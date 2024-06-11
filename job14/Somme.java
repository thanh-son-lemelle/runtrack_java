package job14;

public class Somme {
    public static void main(String[] args) {
        /*
         * Fucntion that takes two integers as arguments
         * And prints the sum of the two integers to the terminal
        */

        // Check if the correct number of arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two integers as arguments.");
            return;
        }

        try {
            // Parse the input arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            // Handle the case where the arguments are not valid integers
            System.out.println("Please provide valid integers as arguments.");
        }
    }
}



