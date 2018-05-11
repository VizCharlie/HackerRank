import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        int len = s.length(), index, assciiVal;
        String cipher = "";
        k = k%26;
        
        for(index = 0 ; index < len ; index++){
            assciiVal = (int) s.charAt(index);
            if((assciiVal >= 65 && assciiVal <= 90) || (assciiVal >= 97 && assciiVal <= 122)){
                if(assciiVal >= 65 && assciiVal <= 90 && assciiVal + k <=90 ){
                    cipher += (char) (assciiVal + k);
                }else if(assciiVal >= 97 && assciiVal <= 122 && assciiVal + k <=122 ){
                    cipher += (char) (assciiVal + k);
                }else{
                    cipher += (char) (assciiVal + k - 26);
                }
                
            }else{
                cipher += s.charAt(index);
            }
        }
        
        return cipher;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
