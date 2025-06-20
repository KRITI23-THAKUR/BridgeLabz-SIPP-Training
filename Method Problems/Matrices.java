import java.util.Scanner;

public class Matrices {

    static int[][] readMatrix(int r, int c, Scanner sc) {
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
        return matrix;
    }

    static int[][] transpose(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] transposed = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read and transpose matrix
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] matrix = readMatrix(r, c, sc);

        System.out.println("Original Matrix:");
        display(matrix);

        System.out.println("Transpose:");
        display(transpose(matrix));

        if (r == 2 && c == 2)
            System.out.println("Determinant 2x2: " + determinant2x2(matrix));

        if (r == 3 && c == 3)
            System.out.println("Determinant 3x3: " + determinant3x3(matrix));
    }
}
