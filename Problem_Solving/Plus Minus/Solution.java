import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double count_positive = 0;
		double count_negative = 0;
		double count_zeros = 0;

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int value = scan.nextInt();
			if (value > 0) {
				count_positive += 1;

			}
			if (value < 0) {
				count_negative += 1;

			}
			if (value == 0) {
				count_zeros += 1;
			}
		}
		
		//print the values precisely upto 6 decimal places
    
		System.out.println(String.format("%.6f", count_positive / n));
		System.out.println(String.format("%.6f", count_negative / n));
		System.out.println(String.format("%.6f", count_zeros / n));

	}
}
