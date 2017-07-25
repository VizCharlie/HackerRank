import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long[] coinVals, int total){
        long[] ways = new long[total + 1];
		ways[0] = 1;
        
		for(long coin : coinVals){
			for(long index = coin; index < ways.length; index++)
				ways[(int) index] = ways[(int) index] + ways[(int) (index - coin)];
		}
       
		return ways[total];
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        System.out.println(getWays(c, n));
    }
}
