import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(String opr) {
        if(opr.charAt(1) == '+')
            return Integer.parseInt(String.valueOf(opr.charAt(0))) + Integer.parseInt(String.valueOf(opr.charAt(2)));
        else
            return Integer.parseInt(String.valueOf(opr.charAt(0))) - Integer.parseInt(String.valueOf(opr.charAt(2)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
