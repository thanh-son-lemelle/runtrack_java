package job08;

public class SortTheMatrix {
    public static void main(String[] args) {
        /*
         * Declare a 2D array of integers with 3 rows and 3 columns.
         * Initialize the array with the following values:
         * 5 9 3
         * 7 2 8
         * 1 6 4
         * Declare a 1D array of integers with the same number of elements as the 2D array.
         * Copy the elements of the 2D array into the 1D array.
         * Sort the 1D array in ascending order.
         * Copy the elements of the 1D array back into the 2D array.
         * Print the elements of the 2D array.
         */
        int [][] matrix = { {5,9,3},
                            {7,2,8},
                            {1,6,4} };
        int [] temp = new int[matrix.length * matrix[0].length];
        int cell = 0;
        // int [][] temp = new int[3][3];
        for (int[] row : matrix) {
            for (int value : row) {
                temp[cell++] = value;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int tempValue = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempValue;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = temp[i * matrix[i].length + j];
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}