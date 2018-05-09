import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), counter;
        
        for(counter = 1 ; counter <= 10 ; counter++){
            System.out.println(num + " x " + counter + " = " + num * counter);
        }      
        
    }
}
