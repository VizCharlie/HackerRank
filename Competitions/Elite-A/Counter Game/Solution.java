import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt(), count = 0, length;
		BigInteger num;
		String inputNum;
		
		while(testCase-- > 0){
			inputNum = input.next();
			num = new BigInteger(inputNum);

			while(!num.equals(BigInteger.ONE)){
				if(num.bitCount() == 1){
					num = num.divide(BigInteger.valueOf(2));
					++count;
				}else{					
					num = num.subtract(BigInteger.valueOf(2).pow(num.bitLength() - 1));
					++count;
				}
			}
			
			if(count % 2 == 1){
				System.out.println("Louise");
			}else
				System.out.println("Richard");
            
            count = 0;
		}				
	}
}
