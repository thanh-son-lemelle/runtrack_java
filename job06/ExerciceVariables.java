package job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        /*
         * Declare two variables of type int named num1 and num2 and assign them the values 74 and 36 respectively
         * Print the values of the variables to the terminal
         * Swap the values of the variables and print the new values to the terminal
         */
        
        int num1 = 74, num2 = 36;

        System.out.println("num1: "+num1+"\n"+"num2: "+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1: "+num1+"\n"+"num2: "+num2);
    }
}
