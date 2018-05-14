import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s) {
      int len = s.length(), index;
        String rev = new StringBuilder(s).reverse().toString();
        
        if(len == 1){
            return "Funny";
        }
        
        for(index = 0 ; index < len - 1 ; ){
            if(Math.abs(s.charAt(index) - s.charAt(index + 1)) == Math.abs(rev.charAt(index) - rev.charAt(index + 1))){
                index++;
            }else
                return "Not Funny";
        }
        
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
