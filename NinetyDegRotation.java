import java.util.Scanner;

public class NinetyDegRotation {
    public static void main(String arg[]) {
        // Rotate a matrix by 90 degrees
        // Input the number of rows and columns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Print the original matrix
        System.out.println("The original matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        int trans[][] = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        // reverse the rows of the transposed matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int temp = trans[i][j];
                trans[i][j] = trans[i][rows - j - 1];
                trans[i][rows - j - 1] = temp;
            }

        }

        // Print the rotated matrix
        System.out.println("The rotated matrix is");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
