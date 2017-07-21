import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int stringIntCompare(String str1, String str2){
        if(str1.length() > str2.length()) return 1;
        if(str1.length() < str2.length()) return -1;
        for(int i = 0; i < str1.length(); i++)
        {
            if((int)str1.charAt(i) > (int)str2.charAt(i)) return 1;
            if((int)str1.charAt(i) < (int)str2.charAt(i)) return -1;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int i = 0; i < n; i++) unsorted[i] = in.next();

        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) 
            {
                return stringIntCompare(str1, str2);
            }
        });
        
        StringBuilder output = new StringBuilder("");
        for(String num : unsorted)
            output.append(num+"\n");
        System.out.println(output);
    }
}
