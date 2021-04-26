package A_Dsa_Mathematics;
import java.util.Scanner;
public class LCM_of_two_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the 1st no. = ");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd no. = ");
		int b = scn.nextInt();
		
		scn.close();
		
		System.out.println("The LCM of "+a+" and "+b+" is : "+ lcm(a, b));

	}
           static int lcm(int a , int b) {
        	  return ((a*b)/gcd(a,b));  
        	   }
                                                 // Here we used the formual i.e. (a*b) = gcd(a*b) * lcm(a*b)
		 static int gcd(int a, int b) {
		     if(b==0) {
			return a;
		     }else {
				return gcd(b, a%b);
		}
        	   
           } 
}

          