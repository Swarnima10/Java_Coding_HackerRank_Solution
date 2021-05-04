// Still finding an efficient way of doing this-- not clear much//

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

/*
 * Complete the 'utopianTree' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tree_ht = new int[n];
		for (int i = 0; i < n; i++) {
			tree_ht[i] = scan.nextInt();
		}
		int max_val = Arrays.stream(tree_ht).max().getAsInt();
		int[] cache = new int[max_val + 1];
		cache[0] = 1;
		for (int i = 1; i <= max_val; i++) {
			if (i % 2 == 1) {
				cache[i] = cache[i - 1] * 2;
			} else {
				cache[i] = cache[i - 1] + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(cache[tree_ht[i]]);
		}

	}
}
