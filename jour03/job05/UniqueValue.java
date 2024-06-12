public class UniqueValue {
    public static void main(String[] args) {
        int [] table = {3, 7, 3, 9, 8};
        for (int testingCell = 0; testingCell < table.length; testingCell++) {
            int count = 1;
            for (int cell = 0; cell < table.length; cell++) {
                if (table[testingCell] == table[cell] && testingCell != cell) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("table[" + testingCell + "] = " + table[testingCell] + " is unique");
            }
        }       
    }
}
