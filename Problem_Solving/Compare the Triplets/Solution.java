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

    // Complete the compareTriplets function below.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a0 = scan.nextInt();
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b0 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        scan.close();
        
        int points_A = (a0 > b0 ? 1 : 0) + (a1 > b1 ? 1 : 0) + (a2 > b2 ? 1 : 0);
        int points_B = (a0 < b0 ? 1 : 0) + (a1 < b1 ? 1 : 0) + (a2 < b2 ? 1 : 0);
        
        System.out.println(points_A + " " + points_B);
    }
}

    
