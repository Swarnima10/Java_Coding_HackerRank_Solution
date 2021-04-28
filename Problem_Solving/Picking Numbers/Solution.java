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

class Result {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		int[] frequency = new int[101];
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < a.size(); i++) {
			int index = a.get(i);
			frequency[index]++;
		}
		for (int i = 1; i <= 100; i++) {
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		}
		System.out.print(result);
		return result;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}

		int result = Result.pickingNumbers(a);

	}
}
