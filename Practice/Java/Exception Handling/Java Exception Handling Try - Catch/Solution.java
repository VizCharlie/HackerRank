import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        try{
            int num_1 = input.nextInt(), num_2 = input.nextInt();
            System.out.println(num_1 / num_2) ;
        }catch(InputMismatchException ime){
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
