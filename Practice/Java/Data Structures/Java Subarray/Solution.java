import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt(), index_x, index_y, counter = 0, sum = 0;
        int[] arr = new int[size];
        
        for(index_x = 0 ; index_x < size ; index_x++){
            arr[index_x] = input.nextInt();
            if(arr[index_x] < 0) counter++;
        }
        
        for(index_x = 0 ; index_x < size - 1 ; index_x++){
            sum = arr[index_x];
            for(index_y = index_x + 1 ; index_y < size ; index_y++){
                sum += arr[index_y];
                
                if(sum < 0) counter++;
            }
        }
        
        System.out.println(counter);
    }
}
