import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int[] closestNumbers(int[] arr) {
        int len = arr.length, index, minDiff = Integer.MAX_VALUE, diff;
        int[] tempArr;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for(index = 0 ; index < len - 1 ; index++){
            diff = Math.abs(arr[index] - arr[index + 1]);
            
            if(minDiff > diff){
                minDiff = diff;
                list = new ArrayList<>();
                list.add(arr[index]);
                list.add(arr[index + 1]);
            }else if(diff == minDiff){
                list.add(arr[index]);
                list.add(arr[index + 1]);
            }
        }
         
        tempArr = new int[list.size()];
        index = 0;
        
        for(int element : list) tempArr[index++] = element;

        return tempArr;
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
        
        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
