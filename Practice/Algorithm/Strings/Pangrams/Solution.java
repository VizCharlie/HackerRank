import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String pangrams(String s) {
        int len = s.length(), index;
        String checker = "abcdefghijklmnoprstuvwxyz";
        String temp;
        s = s.toLowerCase();
        
        for(index = 0 ; index < len ; index++){
            temp = String.valueOf(s.charAt(index));
            
            if(checker.contains(temp)){
                checker = checker.replace(temp,"");
            }
        }
        
        if(checker.length() != 0) return "not pangram";
        else return "pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
