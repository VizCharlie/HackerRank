import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt(), index, query;
        
        for (index = 0 ; index < limit ; index++) {
            query = input.nextInt();
            
            switch (query) {
                case 1:
                    int num = input.nextInt();
                    stack.push(num);
                    if (maxStack.isEmpty() || num >= maxStack.peek()) {
                        maxStack.push(num);
                    }
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
                default:
                    break;
            }
        }  
        
        input.close();
    }
}
