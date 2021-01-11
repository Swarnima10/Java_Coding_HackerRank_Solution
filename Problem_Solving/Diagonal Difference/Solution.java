import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				int matrixValues = scan.nextInt();
				// condition for primary diagonal
				if (row == col) {
					primaryDiagonal += matrixValues;
				}
				// condition for secondary diagonal
				if (row + col == N - 1) {
					secondaryDiagonal += matrixValues;
				}

			}
		}
		scan.close();
		// condition to find absolute difference
		int absoluteDifference = Math.abs(primaryDiagonal - secondaryDiagonal);
		System.out.println(absoluteDifference);
	}
}
