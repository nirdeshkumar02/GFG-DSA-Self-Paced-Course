package A_Dsa_Mathematics;
import java.util.Scanner;
public class Trailing_Zeros_in_Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the value in which you find the trailing zeros = ");
		int n = scn.nextInt();
		
		scn.close();
		
		System.out.println("The trailing zeroes in "+n+" : "+ count_zeros_in_factorial(n));

	}
	      
	static int count_zeros_in_factorial(int n) {
		int result = 0;
		for(int i = 5; i<=n; i= i*5) {
			result = result + (n/i);          // This is the efficient solution   
		}
		return result ;
	}
         
}

