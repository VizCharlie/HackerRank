import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twoCharaters(String s) {
        int maxPattern = 0;
            
        if(s.length() == 1)
        {
            System.out.println(maxPattern);
            System.exit(0);
        }
        
        for(int index_x = 0; index_x < 26; index_x++)
        {
            nextLetter:
            for(int index_y = index_x + 1; index_y < 26; index_y++)
            {
                char one = (char) ('a' + index_x); 
                char two = (char) ('a' + index_y); 
                char lastSeen = '\u0000';
                int patternLength = 0;
                
                for(char letter : s.toCharArray())
                {
                    if(letter == one || letter == two)
                    {
                        if(letter == lastSeen)
                        {
                            continue nextLetter;
                        }
                       
                        patternLength++;
                        lastSeen = letter;
                    }
                }
                
                maxPattern = (patternLength > maxPattern) ? patternLength : maxPattern; 
                
            }
        }
        
        return maxPattern;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
