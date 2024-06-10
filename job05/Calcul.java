package job05;
public class Calcul {
    public static void main(String[] args) {
        int nombre = 7;
        /*
         * Declare a variable of type int named number and assign it the value 7
         * then print the value of the variable to the terminal
         * 
         * add 3 to the value of the variable and print the new value to the terminal
         * 
         * multiply the value of the variable by 5 and print the new value to the terminal
         */
        System.out.println("number value: "+nombre);

        nombre +=3;
        System.out.println("number value + 3: "+nombre);

        nombre *=5;
        System.out.println("number value * 5: "+nombre);
    }

}
