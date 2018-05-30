import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang.ArrayUtils;

public class Solution {
    
    static int[] missingNumbers(int[] arr, int[] brr) {
        int lenArr = arr.length, lenBrr = brr.length, index, value, num;
        int[] tempArr;
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> keys;
        
        for(index = 0 ; index < lenArr ; index++){
            num = arr[index];           
            
            if(map.containsKey(num)) {
                value = map.get(num);
                map.put(num, value + 1);
            }else map.put(num, 1);
        }
        
        for(index = 0 ; index < lenBrr ; index++){
            num = brr[index];
            
            if(map.containsKey(num)){
                value = map.get(num);
                
                if(value - 1 == 0) map.remove(num);
                else map.put(num, value - 1);                    
            }else map.put(num, -1); 
            
        }
        
        keys = map.keySet();
        tempArr = new int[keys.size()];
        index = 0;
         
        for(Integer element : keys) tempArr[index++] = element.intValue();
        Arrays.sort(tempArr);
        
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

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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
