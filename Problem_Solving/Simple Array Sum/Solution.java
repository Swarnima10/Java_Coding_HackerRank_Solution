import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scan.nextInt();
        }
        scan.close();
        System.out.println(sum);
    }
}
