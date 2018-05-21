import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int index, len = s.length();
        
        TreeSet<String> set = new TreeSet<>();
        
        for(index = 0; index + k <= len ; index++){
            set.add(s.substring(index, index + k));
        }
        
        smallest = set.first(); largest = set.last();

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
