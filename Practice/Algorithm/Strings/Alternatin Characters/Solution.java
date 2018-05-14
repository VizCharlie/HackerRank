import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s) {
        int len = s.length(), index, counter = 0;
        
        for(index = 0 ; index < len - 1 ; index++){
            if(s.charAt(index) == 'A'){
                if(s.charAt(index + 1) != 'B') counter++;
                else continue;
            }else if(s.charAt(index) == 'B'){
                if(s.charAt(index + 1) != 'A') counter++;
                else continue;
            }else
                continue;            
        }
        
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
