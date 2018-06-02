import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    } 
    
    static String isBalanced(String s) {
        if(s.length() % 2 != 0) return "NO";
        
        int len = s.length(), index;
        ArrayDeque<Character> deque = new ArrayDeque<>();
        Character ch;
        
        for(index = 0 ; index < len ; index++){
            ch = s.charAt(index);
            
            if(brackets.containsKey(ch))deque.push(ch);
            else if(deque.isEmpty() || ch != brackets.get(deque.pop())) return "NO";
        }

        if(deque.isEmpty()) return "YES";
        else return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
