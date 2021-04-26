package B_Dsa_Recursion;
import java.util.Scanner;
public class Print_1_to_N_using_recursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a no. = ");
		int n = scn.nextInt();
		
		scn.close();
       System.out.print("The no. are: ");
       print_1_to_N(n);
	}

	 static void print_1_to_N(int n) {
		if(n==0) return;
		print_1_to_N(n-1);
		System.out.print(n+" ");
		
	}

}
