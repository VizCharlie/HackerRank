import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    
    static void printSeries(int first, int second, int limit){
        int counter = 0, num = 0;
        
        for(; counter < limit; counter++){
            num = first + (int) Math.pow(2,counter) * second;
            System.out.print(num + " ");
            first = num;
        }
        
        System.out.println();
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            printSeries(a, b, n);
        }
        in.close();
    }
}
