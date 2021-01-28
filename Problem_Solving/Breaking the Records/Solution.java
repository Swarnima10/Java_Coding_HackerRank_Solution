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
        int[] scores = new int[size];
        for (int i = 0; i < size; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate answer */
        breakingRecords(scores);
    }
    private static void breakingRecords(int[] scores){
        int max=scores[0];
        int min=scores[0];
        int higherScore=0;
        int lowerScore=0;
        for(int score:scores){
            if(score>max){
                max=score;
                higherScore++;
            }
            if(score<min){
                min=score;
                lowerScore++;
            }
        }
        System.out.println(higherScore+" "+lowerScore);
    }
}
