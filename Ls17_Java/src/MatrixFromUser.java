import java.util.Scanner;

public class MatrixFromUser {
	// Function to print Matrix
	static void printMatrix(int M[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	// Function to read matrix
	public static void readMatrixByUser() {
		int m, n, i, j;
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			System.out.println("Enter the number " + "of rows of the matrix");
			m = in.nextInt();
			System.out.println("Enter the number " + "of columns of the matrix");
			n = in.nextInt();

			// Declare the matrix
			int first[][] = new int[m][n];

			// Read the matrix values
			System.out.println("Enter the elements of the matrix");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					first[i][j] = in.nextInt();

			// Display the elements of the matrix
			System.out.println("Elements of the matrix are");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++)
					System.out.print(first[i][j] + "  ");
				System.out.println();
			}
		} catch (Exception e) {
		} finally {
			in.close();
		}
	}

	static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {
		int i, j, k;

		// Print the matrices A and B
		System.out.println("\nMatrix A:");
		printMatrix(A, row1, col1);
		System.out.println("\nMatrix B:");
		printMatrix(B, row2, col2);

		// Check if multiplication is Possible
		if (row2 != col1) {

			System.out.println("\nMultiplication Not Possible");
			return;
		}

		// Matrix to store the result
		// The product matrix will
		// be of size row1 x col2
		int C[][] = new int[row1][col2];

		// Multiply the two matrices
		for (i = 0; i < row1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < row2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, row1, col2);
	}

	// Driver code
	public static void main(String[] args) {
		int m, n, i, j;
		Scanner in = null;
		try {
			in = new Scanner(System.in);
			System.out.println("Enter the number " + "of rows of the matrix");
			m = in.nextInt();
			System.out.println("Enter the number " + "of columns of the matrix");
			n = in.nextInt();
			// Declare the matrix
			int first[][] = new int[m][n];

			// Read the matrix values
			System.out.println("Enter the elements of the matrix");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					first[i][j] = in.nextInt();

			// Display the elements of the matrix
			System.out.println("Elements of the matrix are");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++)
					System.out.print(first[i][j] + "  ");
				System.out.println();
			}
			
		} catch (Exception e) {
		} finally {
			in.close();
		}
	}
}
