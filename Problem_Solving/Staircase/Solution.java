import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        
        // Condition for left aligned staircase pattern

        /*
         * for(int i = 0; i < height; i++) { for(int j = 0; j < height; j++) { if(i >=
         * j) { System.out.print("#"); } } System.out.println(); }
         */

        // Condition for right aligned staircase pattern
        int c = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < c) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            c = c - 1;
            System.out.println();
        }
    }
}
