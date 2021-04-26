package A_Dsa_Mathematics;
import java.util.Scanner;
public class All_Divisors {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. = ");
		int n = scn.nextInt();
		scn.close();
		
		System.out.println("The all divisior of "+n+" are : ");
		primeDivisor(n);
	}

//	 static void primeDivisor(int n) {
//		 for(int i = 1; i<=n; i++) {
//			 if(n%i==0) {                        // This is simple solution //
//				System.out.print(i+" ");
//			 }
//		 }
//	}
     
	 
//	 static void primeDivisor(int n) {
//		 for(int i = 1; i*i<n;i++) {
//			 if(n%i==0) {                        // This solution print all divisor but not in any particular order //
//				 System.out.print(i+" ");
//				 if(i!=n/i) {
//					 System.out.print(n/i+" ");
//				 }
//			 }
//		 }
//	 }
	
	static void primeDivisor(int n) {
		int i;
		for(i = 1; i*i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}                                    // This solution print all divisor in increasing order.
		for( ; i>=1; i--) {
			if(n%i==0) {
				System.out.print(n/i+" ");
			}
		}
	}
}
