import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int runningTime(int[] arr) {
        int shifts = 0, index_x, index_y, value;
        for(index_x = 1 ; index_x < arr.length ; index_x++){
            value = arr[index_x];
            index_y = index_x - 1;
            
            while(index_y >= 0 && arr[index_y] > value){
                arr[index_y + 1] = arr[index_y];
                index_y = index_y - 1;
            }
            
            arr[index_y + 1] = value;
            shifts += index_x - (index_y + 1);
        }

        return shifts;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
