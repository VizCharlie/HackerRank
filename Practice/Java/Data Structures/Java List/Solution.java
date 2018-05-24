import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        int size = input.nextInt(), index, queries;
        String command;
        
        for(index = 0 ; index < size ; index++){
            list.add(input.nextInt());
        }
        
        queries = input.nextInt();
        
        for(index = 1 ; index <= queries ; index++){
            command = input.next();
            
            if(command.equalsIgnoreCase("insert")) list.add(input.nextInt(), input.nextInt());
            else if(command.equalsIgnoreCase("delete")) list.remove(input.nextInt());
        }
        
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
