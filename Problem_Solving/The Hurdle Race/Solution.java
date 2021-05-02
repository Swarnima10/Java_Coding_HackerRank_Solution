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
	 * Complete the 'hurdleRace' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER k 2. INTEGER_ARRAY height
	 */

	public static int hurdleRace(int k, List<Integer> height) {
		List<Integer> des_height = height.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //sorted List in descending order
		if (k > des_height.get(0)) {
			return 0;
		} else {
			return des_height.get(0) - k;
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		List<Integer> height = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			height.add(scanner.nextInt());

		}
		int result = Result.hurdleRace(k, height);
		System.out.println(result);
	}
}
