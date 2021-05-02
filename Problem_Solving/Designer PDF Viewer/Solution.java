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

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY h 2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max_height = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            max_height = Math.max(max_height, h.get(index));
        }
        return max_height * word.length();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        final int letters = 26;
        List<Integer> h = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < letters; i++) {
            h.add(scanner.nextInt());
        }
        String word = scanner.next();
        int result = Result.designerPdfViewer(h, word);
        System.out.println(result);
    }
}
