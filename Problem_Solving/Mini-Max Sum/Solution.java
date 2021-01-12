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
		int[] arr = new int[5];
		long sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.print((sum - arr[4]) + " " + (sum - arr[0]));

	}
}
