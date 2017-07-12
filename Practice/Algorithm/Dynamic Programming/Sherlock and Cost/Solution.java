import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input= new Scanner(System.in);
        int testCase = input.nextInt(), size, index, sum = 0;
        int[] arr;
        int[][] arr2;
        
        while(testCase-- > 0){
            size = input.nextInt();
            arr = new int[size];
            arr2 = new int[size][2];
            
            for(index = 0; index < size; index++){
                arr[index] = input.nextInt();
            }
                     
            for(index = 1; index < size; index++){
            	arr2[index][0] = Math.max(arr2[index - 1][0], arr2[index - 1][1] + Math.abs(arr[index - 1] - 1));
            	arr2[index][1] = Math.max(arr2[index - 1][0] + Math.abs(arr[index] - 1), arr2[index - 1][1]);
            }
            
            System.out.println(Math.max(arr2[size - 1][0],arr2[size - 1][1]));
        }
    }
}
