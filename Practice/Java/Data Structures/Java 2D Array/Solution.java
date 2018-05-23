import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int max  = Integer.MIN_VALUE, index_x, index_y, sum = 0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        for(index_x = 1 ; index_x <= 4 ; index_x++){
            for(index_y = 1 ; index_y <= 4 ; index_y++){
                sum = arr[index_x - 1][index_y - 1] + arr[index_x - 1][index_y] + arr[index_x - 1][index_y + 1] + arr[index_x][index_y] + arr[index_x + 1][index_y - 1] + arr[index_x + 1][index_y] + arr[index_x + 1][index_y + 1];
            
                if(sum > max) max = sum;
            }
        }
        
        System.out.println(max);
        scanner.close();
    }
}
