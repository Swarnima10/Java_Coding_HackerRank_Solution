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
        int n = scan.nextInt();
        while (n-- > 0) {
            int grades = scan.nextInt();
            System.out.println(roundoff(grades));
        }
    }

    private static int roundoff(int grades) {
        int value = 0;
        int nearest_multiple = (grades + 4) / 5 * 5;
        if (grades % 5 != 0 && grades >= 38 && (nearest_multiple - grades) < 3) {
            value = nearest_multiple;
        } else {
            value = grades;
        }
        return value;
    }

}
