public class Q21 {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};

        try {
            System.out.println("Addition:");
            printMatrix(add(matrixA, matrixB));

            System.out.println("Multiplication:");
            printMatrix(multiply(matrixA, matrixB));

            System.out.println("Transpose:");
            printMatrix(transpose(matrixA));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException. Please ensure that the matrices are of appropriate dimensions.");
            e.printStackTrace();
        }
    }

    public static int[][] add(int[][] matrixA, int[][] matrixB) throws ArrayIndexOutOfBoundsException {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(int[][] matrixA, int[][] matrixB) throws ArrayIndexOutOfBoundsException {
        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transpose(int[][] matrix) throws ArrayIndexOutOfBoundsException {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
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
