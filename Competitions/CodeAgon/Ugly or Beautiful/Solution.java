import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static String check(int[] arr){
		int size = arr.length, index, counter = 0;
		boolean flag = false;
		int[] tempArr = new int[size];
		
		for(index = 0; index < size; index++){
			if(arr[index] <= size && tempArr[arr[index] - 1] == 0){
				tempArr[arr[index] - 1]++;
				if(index > 0 && arr[index] > arr[index - 1]){
					counter++;
				}
			}else{
				flag = true;
				break;
			}
			
		}
		
		if(flag || counter == size - 1) return "Ugly";
		else return "Beautiful";	
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
        
        while(testCase-- > 0){
            int size = input.nextInt(), index;
            int[] arr = new int[size];
            
            for(index = 0; index < size; index++){
            	arr[index] = input.nextInt();
            }
            
            String result = check(arr);
            System.out.println(result);
        }
    }
}
