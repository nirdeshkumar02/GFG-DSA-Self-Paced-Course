package A_Dsa_Mathematics;
import java.util.Scanner;
public class Prime_Factors {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. = ");
		int n = scn.nextInt();
		scn.close();
		
		
		System.out.println("The Prime Factors are : ");
		primeFactor(n);
}
  
//	 static void primeFactor(int n) {
//		if(n<=1) {
//			return;
//		}
//		for(int i = 2; i*i<=n; i++) {
//			while(n % i == 0) {
//				System.out.print( i+" ");          // This is efficient solution//
//				n=n/i;
//			}
//		}
//		if(n>1) {
//			System.out.println(n);
//		}
//		}
	
	 static void primeFactor(int n) {
		 if(n<=1) {
			 System.out.println(n);
		 }
		 while(n%2==0) {
			 System.out.print(2+" ");
			 n=n/2;
		 }
		 while(n%3==0) {
			 System.out.print(3+" ");
			 n=n/3;
		 }                                // THis is the most efficient solution //
		 for(int i=5;i*i<n;i=i+6) {
			 while(n%i==0) {
				 System.out.print(i+" ");
				 n=n/i;
			 }
			 while(n%(i+2)==0) {
				 System.out.print((i+2)+" ");
				 n=n/(i+2);
			 }
		 }
		 if(n>3) {
			 System.out.print(n+" ");
		 }
	 }
	}
