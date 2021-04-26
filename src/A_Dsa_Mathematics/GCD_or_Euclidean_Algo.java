package A_Dsa_Mathematics;
import java.util.Scanner;
public class GCD_or_Euclidean_Algo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the 1st value = ");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd value = ");
		int b = scn.nextInt();
		
		scn.close();
		
		System.out.println("The gcd of "+a+" and "+b+" is : "+ gcd(a , b));
	}
	
	                   // This is the simple solution // 
	
//	 static int gcd(int a, int b) {
//		int result = Math.min(a , b);
//		while(result > 0) {
//			if(a % result == 0 && b % result == 0) {
//				break;               
//			}
//			result--;
//		}
//		return result;
//	}

	               //Euclidean Solution //
	
//	static int gcd(int a, int b) {
//		while(a!=b) {
//			if(a>b) {
//				a = a-b;
//			}else
//				b = b-a;
//		}
//		return a;
//	}
	
	
	               //Optimize Euclidean Algorithm//
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else
			return gcd(b, a % b);
	}
}
