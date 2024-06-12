public class RandomTable {
    public static void main(String[] args) {
        int [] table = new int [5];
        for (int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 100);
            System.out.println("table[" + i + "] = " + table[i]);
        }
    }
}

