import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int query = sc.nextInt(); 
        int queryType = 0;
        int element = 0;
        
        while(query-- > 0) {
            queryType = sc.nextInt();
            switch(queryType){
                case 1:
                    element = sc.nextInt();
                    minHeap.add(element);
                    break;
                case 2:
                    element = sc.nextInt();
                    minHeap.remove(element);
                    break;
                case 3:
                    System.out.println(minHeap.peek());
            }
        }
    }
}
