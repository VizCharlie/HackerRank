import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        String SOS = "SOS";
        int len = s.length(), index, tempIndex, counter = 0;    
        
        if(len == 0) return 0;
        
        for(index = 0, tempIndex = 0 ; index < len; index++, tempIndex++){   
            if(index%3 == 0) tempIndex = 0;
            
            if(s.charAt(index) != SOS.charAt(tempIndex)){
                counter++;
            }            
        }
        
        return counter;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
