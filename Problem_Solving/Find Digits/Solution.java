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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        while (size-- > 0) {
            int num = scan.nextInt();
            System.out.println(findDigits(num));
        }
        scan.close();
    }

    private static int findDigits(int num) {
        int count = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
