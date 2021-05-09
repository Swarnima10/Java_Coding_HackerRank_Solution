//Beautiful and Efficient solution using Modulo Technique// **



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int n, k, q;
		n = in.nextInt();
		k = in.nextInt();
		q = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[(i + k) % n] = in.nextInt();
		}
		for (int i = 0; i < q; i++) {
			System.out.println(arr[in.nextInt()]);
		}
	}
}
