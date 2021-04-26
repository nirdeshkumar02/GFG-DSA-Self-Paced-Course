package A_Dsa_Mathematics;
import java.util.Scanner;
public class check_for_prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. = ");
		int n = scn.nextInt();
		scn.close();
		
		System.out.println("The given no. "+n+" is prime : True or False: "+ isPrime(n));

	}
	
//	  static boolean isPrime(int n) {
//		  if(n==1) {
//			  return false;
//		  }
//		  for(int i =2; i<n; i++) {                     //This is the naive or simple solution //
//			  if(n % i == 0) {
//				  return false;
//			  }
//			
//		  }
//		  return true;
//	  }

	
//	 static boolean isPrime(int n) {                       // This is the efficient solution // We know that division of a no. always show in pair like
//		 if(n==1) return false;                            // 30 = (1,30),(2,15),(3,10),(5,6) therefor  // if (x,y) is a pair then (x * y = n) and if (x <= y)
//		 for(int i = 2; i*i < n; i++) {                         //  (x * x <= n) -->  then (x <= n^1/2)
//			 if(n % i == 0) return false;                
//		 }
//		 return true;
//	 }
	
	
	static boolean isPrime(int n) {                      // This is more efficient solution for large input size // 
		if(n==1)return false;
		if(n==2 || n==3) return true;
		if(n % 2 == 0 && n % 3 == 0) return false;
		for(int i = 5; i*i < n ; i=i+6) {
			if(n % i == 0 && n % (i+2)==0) return false;
		}
		return true;
	}
	 
}
