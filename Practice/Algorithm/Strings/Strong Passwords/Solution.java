import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        int missingWord = 0;
        
        if(!Pattern.matches(".*[a-z].*", password)) missingWord++;
        if(!Pattern.matches(".*[A-Z].*", password)) missingWord++;
        if(!Pattern.matches(".*[!@#$%^&*()\\-+].*", password)) missingWord++;
        if(!Pattern.matches(".*[0-9].*", password)) missingWord++;
        if(missingWord + n < 6) missingWord = 6 - n;
        
        return missingWord;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
