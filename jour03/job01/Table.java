public class Table {
    public static void main(String[] args) {
        int [] table = new int [5];
        table[0] = 10;
        table[2] = 2;
        table[4] = 69;
        for (int i = 0; i < table.length; i++) {
            System.out.println("table[" + i + "] = " + table[i]);
        }
    }
}
