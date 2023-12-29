package phase1_practiceEx;

import java.util.Scanner;

public class MatrixMultiplication {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter details for the first matrix:");
        System.out.print("Enter the number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        inputMatrix(matrix1, "first");

        // Input for the second matrix
        System.out.println("\nEnter details for the second matrix:");
        System.out.print("Enter the number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        inputMatrix(matrix2, "second");

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        // Multiply matrices
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("\nResultant Matrix after multiplication:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to input matrix elements
    @SuppressWarnings("resource")
	private static void inputMatrix(int[][] matrix, String matrixName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the " + matrixName + " matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

