import java.util.ArrayList;
import java.util.Arrays;
public class Table {
    public static void main(String[] args) {
        /*
         * Create a dynamic array of integers named monTableau
         * Add the following values to the array: 12, 6, 76, 89
         * Print the array using the Arrays.toString() method
         * Print the array using a for loop
         * Print the array using a for-each loop
         * Print the array using the Arrays.stream() method
         * Add new values to the array:
         * print the array using the Arrays.toString() method
         */
        
        ArrayList<Integer> monTableau = new ArrayList<Integer>();
        monTableau.add(12);
        monTableau.add(6);
        monTableau.add(76);
        monTableau.add(89);
        // Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println(Arrays.toString(monTableau.toArray()));
        // for loop
        System.out.println("for loop");
        for (int i = 0; i < monTableau.size(); i++) {
            System.out.println("monTableau[" + i + "] = " + monTableau.get(i));
        }
        // for-each loop
        System.out.println("for-each loop");
        for (int cell : monTableau) {
            System.out.println("monTableau[" + monTableau.indexOf(cell) + "] = " + cell);
        }
        // Arrays.stream()
        System.out.println("Arrays.stream()");
        monTableau.stream().forEach(cell -> System.out.println("monTableau[" + monTableau.indexOf(cell) + "] = " + cell));
        // Add new values
        monTableau.add(100);
        monTableau.add(200);
        monTableau.add(300);
        System.out.println("monTableau after adding new values");
        for (int cell : monTableau) {
            System.out.println("monTableau[" + monTableau.indexOf(cell) + "] = " + cell);
        }
    }
}

