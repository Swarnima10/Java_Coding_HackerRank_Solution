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
        int size = scan.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[size - 1]) {
                count++;
            }

        }
        System.out.print(count);

    }
}
