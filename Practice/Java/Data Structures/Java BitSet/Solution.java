import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt(), noOfOper = input.nextInt(), index, bit_1, bit_2;
        String oper = "";
        BitSet B1 = new BitSet(length);
        BitSet B2 = new BitSet(length);
        
        for(index = 1 ; index <= noOfOper ; index++){
            oper = input.next();
            bit_1 = input.nextInt();
            bit_2 = input.nextInt();
            
            if(oper.equalsIgnoreCase("AND")){
                if(bit_1 == 1 && bit_2 == 1){
                    B1.and(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 1 && bit_2 == 2){
                    B1.and(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 1){
                    B2.and(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 2){
                    B2.and(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }
            }else if(oper.equalsIgnoreCase("OR")){
                if(bit_1 == 1 && bit_2 == 1){
                    B1.or(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 1 && bit_2 == 2){
                    B1.or(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 1){
                    B2.or(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 2){
                    B2.or(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }
            }else if(oper.equalsIgnoreCase("XOR")){
                if(bit_1 == 1 && bit_2 == 1){
                    B1.xor(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 1 && bit_2 == 2){
                    B1.xor(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 1){
                    B2.xor(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }else if(bit_1 == 2 && bit_2 == 2){
                    B2.xor(B2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }
            }else if(oper.equalsIgnoreCase("FLIP")){
                if(bit_1 == 1){
                    B1.flip(bit_2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality());                     
                }else if(bit_1 == 2){
                    B2.flip(bit_2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }
            }else if(oper.equalsIgnoreCase("SET")){
                if(bit_1 == 1){
                    B1.set(bit_2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality());                     
                }else if(bit_1 == 2){
                    B2.set(bit_2);
                    System.out.println(B1.cardinality() + " " + B2.cardinality()); 
                }
            }
        }
    }
}
