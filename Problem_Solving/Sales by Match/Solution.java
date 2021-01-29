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
		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		HashSet<Integer> set = new HashSet<Integer>(); //Nice Approach**
		for (int element : arr) {
			if (set.contains(element)) {
				set.remove(element);
				count++;
			} else {
				set.add(element);
			}
		}
		System.out.println(count);

	}
}
