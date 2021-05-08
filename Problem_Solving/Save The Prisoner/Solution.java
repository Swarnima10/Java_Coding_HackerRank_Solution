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
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int result = 0;
			int N = scan.nextInt();
			int M = scan.nextInt();
			int S = scan.nextInt();
			if ((M % N + S - 1) % N == 0) {
				result = N;
			} else {
				result = (M % N + S - 1) % N;
			}
			System.out.println(result);
		}

	}

}
