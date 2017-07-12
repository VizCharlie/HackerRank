import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt(), jump = input.nextInt(), energy = 100, index, aerithIndex = 0;
        int[] clouds = new int[size];
        
        for(index = 0; index < size; index++){
            clouds[index] = input.nextInt();
        }
        
        while(true){
        	aerithIndex = (aerithIndex + jump) % size;
        	if(aerithIndex == 0){
        		if(clouds[aerithIndex] == 0){
        			--energy;        		
        		}else
        			energy -= 3;
                
        		break;
        	}else{
        		if(clouds[aerithIndex] == 0){
        			--energy;        		
        		}else
        			energy -= 3;
        	}       	
        }
        
        System.out.println(energy);
    }
}
