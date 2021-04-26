package A_Dsa_Mathematics;
import java.util.*;
public class sieve_of_erathosthenes_prime_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. = ");
		int n = scn.nextInt();
		scn.close();
		System.out.print("The Prime no. are : ");
		sieve(n);

	}

	 static void sieve(int n) {
		if(n<=1) return;
		boolean[] isPrime = new boolean[n+1];
		for(int i =0; i<n;i++) {
			isPrime[i]=true;
		}
		for(int j =2; j*j<=n; j++) {
			if(isPrime[j]) {
				for(int i = j*j; i<=n; i = i+j) {
					if(isPrime[i]=false);
				}
			}
		}
		for(int i = 2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
			}
		}
		
	}

	

}
