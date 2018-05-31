import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void leftRotation(int[] arr, int rot){
        int len = arr.length, index, tempIndex, counter = 0;
              
        if(rot >= len) {
            tempIndex = rot - len - 1;
            index = rot - len; 
        }else {
            tempIndex = rot - 1;
            index = rot;
        }
        
        for( ; index <= len && counter < len; index++, counter++){
            if(index == tempIndex){
                System.out.println(arr[index]);
                break;
            }else if(index == len) index = 0;
            
            System.out.print(arr[index] + " ");
        }
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        leftRotation(a, d);
        scanner.close();
    }
}
