import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void printArray(int[] arr) {
        for(int element : arr){
            System.out.print(element + " ");
        }
            System.out.println("");
    }
    
    static void insertionSort2(int n, int[] arr) {
        int index_x, index_y, temp;
        
        for(index_x = 0 ; index_x < n - 1 ; index_x++){
          index_y = index_x + 1;
            
          while(index_y > 0){
            if(arr[index_y] < arr[index_y - 1]){
              temp = arr[index_y];
              arr[index_y] = arr[index_y - 1];
              arr[index_y - 1] = temp;
              index_y--;
            }else{
            	break;
            }
          }
          printArray(arr);
        }
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

        insertionSort2(n, arr);

        scanner.close();
    }
}
