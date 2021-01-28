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
        int n = scan.nextInt();
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        int m = scan.nextInt();
        // Using Sliding Window Concept
        // https://www.geeksforgeeks.org/sum-of-all-subarrays-of-size-k/ (go through
        // this)
        calculateResult(n, squares, d, m);

    }

    private static void calculateResult(int n, int[] squares, int d, int m) {
        int sum = 0;
        int count = 0;
        // find sum till sliding window i.e 'm' here
        for (int i = 0; i < m; i++) {
            sum += squares[i];
        }
        // check condition
        if (sum == d) {
            count++;
        }
        //add the latest one and remove the previous one 
        for (int i = m; i < n; i++) {
            sum += squares[i] - squares[i - m];
            if (sum == d) {
                count++;
            }
        }
        System.out.println(count);

    }

}
