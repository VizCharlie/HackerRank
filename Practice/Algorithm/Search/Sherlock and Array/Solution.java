import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] arr){
        int len = arr.length, sum = 0, index, curr;
        
        for(index = 0 ; index < len ; index++){
            sum += arr[index];
        }
        
        curr = 0;
        for(index = 0 ; index < len ; index++){
            if(curr == sum - arr[index] - curr){
                return "YES";
            }
            curr += arr[index];
        }
        return "NO";   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
