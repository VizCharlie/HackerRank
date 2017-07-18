import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sumDigits(int sum) {
        return sum == 0 ? 0 : sum % 10 + sumDigits(sum / 10);
    }
	
    static String onceInATram(int num) {
    	int firstThree, lastThree, sumFirst , sumLast;
    	   	
    	while(true){
    		num++;
    		firstThree = num / 1000;
    		lastThree = num % 1000;
    		sumFirst = sumDigits(firstThree);
        	sumLast = sumDigits(lastThree);
        	
        	if(sumFirst == sumLast){
        		break;
        	}  		
    	}
    	
    	return String.valueOf(num);      
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      String result = onceInATram(x);
      System.out.println(result);
    }
}
