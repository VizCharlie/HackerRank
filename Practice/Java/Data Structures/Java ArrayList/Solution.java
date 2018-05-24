import java.io.*;
import java.util.*;

public class Solution {

    static void findNumber(int row, int col, ArrayList list){
        ArrayList<Integer> tempList = (ArrayList)list.get(row - 1);
        
        if(tempList.isEmpty() || col > tempList.size()) System.out.println("ERROR!");
        else System.out.println(tempList.get(col - 1));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> innerList;
        
        int lines = input.nextInt(), index_x, index_y, size, queries, row, col;
        
        for(index_x = 0 ; index_x < lines ; index_x++){
            size = input.nextInt();
            innerList = new ArrayList<>();
            
            for(index_y = 0; index_y < size ; index_y++){
                innerList.add(input.nextInt());
            }
            
            list.add(innerList);
        }
        
        queries = input.nextInt();
        
        for(index_x = 1 ; index_x <= queries ; index_x++){
            row = input.nextInt(); col = input.nextInt();
            findNumber(row, col, list);
        }
    }
}
