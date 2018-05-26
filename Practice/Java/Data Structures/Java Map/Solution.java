import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh){
		Scanner input = new Scanner(System.in);
        
        HashMap<String, Integer> map = new HashMap<>();
        int limit = input.nextInt(), index, number;
        String name;
        
        input.nextLine();
        for(index = 0 ; index < limit ; index++){
            name = input.nextLine();
            number = input.nextInt();
            input.nextLine();
            map.put(name, number);
        }
        
        while(input.hasNext()){
            name = input.nextLine();
            
            if(map.containsKey(name)) System.out.println(name + "=" + map.get(name));
            else System.out.println("Not found");
        }
	}
}
