package A_Dsa_Mathematics;
import java.util.Scanner;
public class Palindrome_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number that u wanna check= ");
		int n = scn.nextInt();
		scn.close();
		System.out.println("The given no. "+n+" is palindrom: True or False: "+ isPalindrome(n));
	}

	static boolean isPalindrome(int n) {
		int reverse = 0;
		int temp = n;
		while(temp!=0) {
			int digit = temp%10;
			reverse = reverse*10+digit;
			temp = temp/10;
		}
		return (reverse==n);
	}

}
