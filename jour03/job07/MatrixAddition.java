package job07;
public class MatrixAddition {
    public static void main(String[] args) {
        int [][] matrix1 = { {1,2,3},{4,5,6},{7,8,9} };
        int [][] matrix2 = { {10,20,30},{40,50,60},{70,80,90} };
    
        int [][] matrix3 = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println("matrix3[" + i + "][" + j + "] = " + matrix3[i][j]);
            }
        }
    }
}
