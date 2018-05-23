import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int array2D(int[][] arr) {
       int max = Integer.MIN_VALUE, index_x, index_y, sum = 0;
        
        for(index_x = 1 ; index_x <= 4 ; index_x++){
            for(index_y = 1 ; index_y <= 4 ; index_y++){
                sum = arr[index_x - 1][index_y - 1] + arr[index_x - 1][index_y] + arr[index_x - 1][index_y + 1] + arr[index_x][index_y] + arr[index_x + 1][index_y - 1] + arr[index_x + 1][index_y] + arr[index_x + 1][index_y + 1];
            
                if(sum > max) max = sum;
            }
        }
        
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
