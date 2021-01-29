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
		int year = scan.nextInt();
		String date = calculateDate(year);
		System.out.println(date);
	}

	private static String calculateDate(int year) {
		String date = "";
		if (year < 1918) { // Julian Check for leap year
			date += (year % 4 == 0 ? "12.09." + year : "13.09." + year);
		} else if (year == 1918) { // Special case:Transition Year
			date += "26.09." + year;
		} else {// Gregorian check for leap year
			date += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
		}
		return date;
	}
}
