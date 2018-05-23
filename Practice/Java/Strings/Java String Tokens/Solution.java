import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        if(s.trim().length() == 0){
            System.out.println("0");
            return;
        }
        
        String[] arr = s.trim().split("[\\W[_]]+");
        int index, len = arr.length;
        
        System.out.println(len);
        for(index = 0 ; index < len ; index++){
            System.out.println(arr[index]);
        }
        
        scan.close();
    }
}
