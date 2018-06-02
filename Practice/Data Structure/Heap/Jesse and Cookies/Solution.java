import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int cookies(int k, int[] A) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int index, ALen = A.length, count = 0;
        
        for(index = 0 ; index < ALen ; index++){
            queue.add(A[index]);
        }
        
        while(queue.peek() < k && queue.size() >= 2){
            queue.add(queue.remove() + 2 * queue.remove());   
            count++;
        }

        if(queue.size() == 1 && queue.peek() < k){
            count = -1;
        }
  
        return count; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
