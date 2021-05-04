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
        int count = 0;
        int start_no = scan.nextInt();
        int end_no = scan.nextInt();
        int divisor = scan.nextInt();
        for (int i = start_no; i <= end_no; i++) {
            int number = i, reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            if (Math.abs(i - reverse) % divisor == 0) {
                count++;
            }

        }
        System.out.print(count);
    }

}

//Solution 2
//efficient way of reversing the number
public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int start_no = scan.nextInt();
		int end_no = scan.nextInt();
		int divisor = scan.nextInt();
		for (int i = start_no; i <= end_no; i++) {
			
			if (Math.abs(i - reverse(i)) % divisor == 0) {
				count++;
			}

		}
		System.out.print(count);
	}

	private static int reverse(int i) {
		StringBuilder sb=new StringBuilder();
		sb.append(i);
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}

}

