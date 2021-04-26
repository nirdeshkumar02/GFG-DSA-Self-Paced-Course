package A_Dsa_Mathematics;
import java.util.Scanner;
public class Digit_in_Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no.  = ");
		int n = scn.nextInt();
		
		scn.close();
		System.out.println("The digits in factorial : "+digitsInFactorial(n));

	}

	  static int digitsInFactorial(int n) {
		  if(n<0) return 0;
	      if (n<=1) return 1;
	       double digit = 0;
	       for(int i =2; i<=n;i++){
	           digit += Math.log10(i);
	           
	       }
	        return (int)(Math.floor(digit)) + 1;
		
	}
}
	  


