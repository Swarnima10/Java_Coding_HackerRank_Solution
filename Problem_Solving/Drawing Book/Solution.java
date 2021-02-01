import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		int min_count = countFlips(n, p);
		System.out.println(min_count);
	}

	private static int countFlips(int n, int p) {
		int totalFlips_EndPage = n / 2; // From the start to reach end page
		int totalFlips_ReachPage = p / 2; // From the start to reach desired page
		int totalFlips_FromEnd = totalFlips_EndPage - totalFlips_ReachPage; // From the end to reach desired page;
		return (Math.min(totalFlips_ReachPage, totalFlips_FromEnd));

	}
}
