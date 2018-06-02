import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static boolean allThreeEqual(int h1Sum, int h2Sum, int h3Sum) {
        return (h1Sum == h2Sum) && (h2Sum == h3Sum);
    }
    
    static int equalStacks(int[] h1, int[] h2, int[] h3, int h1Sum, int h2Sum, int h3Sum) {
        int index_h1 = 0, index_h2 = 0, index_h3 = 0, h1Len = h1.length, h2Len = h2.length, h3Len = h3.length;
        
            while (!allThreeEqual(h1Sum, h2Sum, h3Sum)) {
                if (h1Sum >= h2Sum) {
                    if (h1Sum >= h3Sum) {
                        h1Sum -= h1[index_h1++];
                    } else {
                        h3Sum -= h3[index_h3++];
                    }
                }else{
                    if (h2Sum >= h3Sum) {
                        h2Sum -= h2[index_h2++];
                    } else {
                        h3Sum -= h3[index_h3++];
                    }
                }
                
                if ((index_h1 >= h1Len) || (index_h2 >= h2Len) || (index_h3 >= h3Len)) {
                    h1Sum = 0;
                    break;
                }
            }

        return h1Sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];
        int h1Sum = 0;

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
            h1Sum += h1Item;
        }

        int[] h2 = new int[n2];
        int h2Sum = 0;

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
            h2Sum += h2Item;
        }

        int[] h3 = new int[n3];
        int h3Sum = 0;

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
            h3Sum += h3Item;
        }

        int result = equalStacks(h1, h2, h3, h1Sum, h2Sum, h3Sum);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
