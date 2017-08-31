import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt(), index, height = 1, cycle;
        
        while(testCase-- > 0){
            cycle = input.nextInt();
            
            if(cycle == 0) System.out.println(height);
            else{
               for(index = 1; index <= cycle; index++){
                    if(index % 2 == 0) height += 1;
                    else height *= 2;
               } 
                System.out.println(height);
            }
            
            height = 1;
         
        }
    }
}
