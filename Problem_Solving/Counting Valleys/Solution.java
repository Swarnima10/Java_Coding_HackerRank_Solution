import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int count = valleyCount(n, s);
		System.out.println(count);
	}

	private static int valleyCount(int n, String s) {
		int count = 0;
		int altitude = 0;
		for (char c : s.toCharArray()) {
			if (c == 'U') {
				altitude++;
				if (altitude == 0) {
					count++;
				}
			}

				else {
					altitude--;
				}
			}

		return count;
	}
}
