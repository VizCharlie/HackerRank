import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long getSum(long end, long diff){
        return (end * (end + 1) * diff )/ 2;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        
        while(testCase-- > 0){
            long num = input.nextLong() - 1;
            
            System.out.println(getSum(num / 3, 3) + getSum(num / 5, 5) - getSum(num / 15, 15));
        }
    }
}
