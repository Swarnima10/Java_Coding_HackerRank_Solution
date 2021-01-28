import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] birds = new int[n];
		for (int i = 0; i < n; i++) {
			birds[i] = scan.nextInt();
		}

		calculateResult(birds);

	}

	private static void calculateResult(int[] birds) {
		final int NUM_TYPES = 5;
		int[] count = new int[NUM_TYPES + 1];
		for (int num : birds) {
			count[num]++;
		}
		int max_length = 1;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > count[max_length]) {
				max_length = i;
			}
		}
		System.out.println(max_length);
	}
}
