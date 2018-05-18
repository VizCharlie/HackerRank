import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void printArr(int[] arr){
        for(int element: arr){
                System.out.print(element + " ");
        }

        System.out.println("");    
    }
    
    static void insertionSort1(int n, int[] arr) {
        int len = arr.length, last = arr[len - 1], index = len - 2;
        
        while (index + 1 > 0 && last <= arr[index]){
            arr[index + 1] = arr[index--];
            
            printArr(arr);
        }
        
        arr[index + 1] = last;
        printArr(arr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
