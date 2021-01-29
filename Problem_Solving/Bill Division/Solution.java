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
        int k = scan.nextInt();
        List<Integer> bill = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int item_amount = scan.nextInt();
            bill.add(item_amount);
        }
        int charged_bill = scan.nextInt();

        calculateBill(n, k, bill, charged_bill);
    }

    private static void calculateBill(int n, int k, List<Integer> bill, int charged_bill) {
        int sum = 0;
        for (int amount : bill) {
            sum += amount;
        }
        int actualBill = (sum - bill.remove(k)) / 2;
        if (charged_bill == actualBill) {
            System.out.println("Bon Appetit");
        } else
            System.out.println(charged_bill - actualBill);

    }
}
