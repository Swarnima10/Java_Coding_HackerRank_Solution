import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int t = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		int n = scan.nextInt();
		int no_of_apples = 0;
		for (int i = 0; i < m; i++) {
			int apple_pos = a + scan.nextInt();
			if (apple_pos >= s && apple_pos <= t) {
				no_of_apples += 1;
			}
		}
		System.out.println(no_of_apples);

		int no_of_oranges = 0;
		for (int i = 0; i < n; i++) {
			int orange_pos = b + scan.nextInt();
			if (orange_pos >= s && orange_pos <= t) {
				no_of_oranges += 1;
			}
		}
		System.out.println(no_of_oranges);
	}
}
