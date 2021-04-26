package B_Dsa_Recursion;
import java.util.Scanner;
public class Recutsion_convert_decimal_to_binary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("Enter the value on n = ");
		int n = scn.nextInt();
		scn.close();
		System.out.print("The conversion from decimal no. "+n+" to binary is : ");
		fun(n);
			
		}
                static void fun(int n) {
                	if(n==0) return ;
                	fun(n/2);
                	 System.out.print(n%2);
                }
	}


// This recursion function convert_decimal_to_binary no.//