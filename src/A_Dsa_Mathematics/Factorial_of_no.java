package A_Dsa_Mathematics;
import java.util.Scanner;
public class Factorial_of_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. = ");
		int n = scn.nextInt();
		
		scn.close();
		
		System.out.println("The factorial of "+n+" is "+factorial(n));

	}

	 static int factorial(int n) {
		int result = 1;
		for(int i = n; i>=1; i--) {           // This is the simple solution//
			result = result*i;
		}
		return result;
	}

	
//	static int factorial(int n) {
//		if(n==0) return 1;                 // This is the recursive solution //
//	return n * factorial(n-1); 
//	}
}
