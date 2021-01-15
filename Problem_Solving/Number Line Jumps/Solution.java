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
		String response = "NO";
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		if (v2 < v1) {
			boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0; // validate that the point of intersection is a whole number
			if (willIntersectOnLand) {
				response = "YES";
			}
		}
		System.out.println(response);

	}

}
