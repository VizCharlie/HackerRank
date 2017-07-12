import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt(), dollars = 0, price = 0, wrap = 0, choco = 0, wrapChoco;
        
        while(testCase >= 0){
            dollars = input.nextInt();
            price = input.nextInt();
            wrap = input.nextInt();
            
            choco += (dollars / price);
            wrapChoco = choco;
            while(wrapChoco >= wrap){    
                choco += (wrapChoco / wrap);
                wrapChoco = (wrapChoco / wrap) + (wrapChoco % wrap);
                
            }
            
            System.out.println(choco);
            choco = 0; --testCase;
        }    
    }
}
