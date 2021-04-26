package A_Dsa_Mathematics;
import java.util.Scanner;
public class Digit_in_num {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a value = ");
		int n = scn.nextInt();
	    scn.close();
	    System.out.println("Digits in "+n+" is = "+ countDigit(n));
		
		
	}

        static int countDigit(long n) {
		 int count = 0;
		 while(n!=0) {                      // This is the simple solution to find digits in a number//
			 n=n/10;
			 ++count;
		 }
		return count;
	}
	
	
	
	
//	static int countDigit(long n) {
//		if(n==0) 
//			return 0;                       // This is the recursive solution//
//		return 1+countDigit(n/10);
//	}

	
	
//	static int countDigit(long n) {
//		return (int) Math.floor(Math.log10(n)+1);        // This is the logarithmic solution
//	}
	
//	
//	static int countDigit(int n) {
//		String num = Integer.toString(n);           // This is the another solution where we change int to string 
	                                                // and return the length of that.
//		return num.length();
//	}
}
