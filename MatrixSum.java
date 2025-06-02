public class MatrixSum {
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Alternative method using enhanced for loop
    public static int sumMatrixEnhanced(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Sample 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Calculate sum using both methods
        int sum1 = sumMatrix(matrix);
        int sum2 = sumMatrixEnhanced(matrix);
        
        System.out.println("Matrix elements:");
        printMatrix(matrix);
        System.out.println("\nSum using regular for loops: " + sum1);
        System.out.println("Sum using enhanced for loops: " + sum2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}