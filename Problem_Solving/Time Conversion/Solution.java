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
		String twelveHoursTime = scan.nextLine();
		// Date/time pattern of input date (12 Hours format - hh used for 12 hours)
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");

		// Date/time pattern of desired output date (24 Hours format HH - Used for 24
		// hours)
		DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		String output = null;

		// Returns Date object
		date = df.parse(twelveHoursTime);

		// old date format to new date format
		output = outputformat.format(date);
		System.out.println(output);
	}
}
