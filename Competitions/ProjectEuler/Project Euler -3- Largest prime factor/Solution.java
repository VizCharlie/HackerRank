import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long getLargestPrimeFactor(long num){
        long index, temp = num;
        
        for(index = 2; index < num; index++){
            if(temp % index == 0){
                temp /= index;
                index--;
            }
        }
        
        return index;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        
        while(testCase-- > 0){
            long num = input.nextLong();
            
            System.out.println(getLargestPrimeFactor(num));
        }
    }
}
