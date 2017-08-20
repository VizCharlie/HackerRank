import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long fibonacci(long num){
        long first = 0, second = 1, sum = 0, index, third = 0;
        
        for(index = 1; index <= num && third <= num; index++){
            third = first + second; 
            first = second;
            second = third;
            
            if(third % 2 == 0 && third <= num){
                sum += third;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        long num;
        
        while(testCase-- > 0){
            num = input.nextLong();
            
            System.out.println(fibonacci(num));
        }
    }
}
