import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int len = s.length(), index;
        long firstNumber, number, min;
        
        if (s.charAt(0) == '0') {
			System.out.println("NO");
            return;
		}
        
		for (index = 1 ; index * 2 <= len ; index++) {
			firstNumber = Long.parseLong(s.substring(0, index));

			StringBuilder sequence = new StringBuilder();
			
            number = firstNumber;
            min = number;
            
			while (sequence.length() < s.length()) {
				sequence.append(number);
				number++;
			}
            
			if (sequence.toString().equals(s)) {
                System.out.println("YES" + " " + min);
                return;
            }
		}
        
        System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
