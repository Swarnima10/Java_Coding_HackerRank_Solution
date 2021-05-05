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
		int recepients = 5;
		int count = 0;
		int cumulative = 0;
		int days = scan.nextInt();
		for (int i = 1; i <= days; i++) {
			int liked = recepients / 2;
			cumulative = liked + count;
			recepients = 3 * liked;
			count = cumulative;
		}
		System.out.println(cumulative);

	}

}
