import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt(), size, sum, index_x, index_y;
        int[] num, sack;
        
        while(testCase-- > 0){
            size = input.nextInt();
            sum = input.nextInt();
            
            num = new int[size];
            sack = new int[sum + 1];
            
            for(index_x = 0; index_x < size; index_x++){
                num[index_x] = input.nextInt();
            }
            
            for(index_x = 1; index_x <= sum; index_x++){
                for(index_y = 0; index_y < size; index_y++){
                    if(num[index_y] <= index_x){
                        sack[index_x] = Math.max(sack[index_x], num[index_y] + sack[index_x - num[index_y]]);
                    }
                }
            }
            
            System.out.println(sack[sum]);
        }
    }
}
