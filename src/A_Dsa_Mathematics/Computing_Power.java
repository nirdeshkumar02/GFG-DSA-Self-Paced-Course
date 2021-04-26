package A_Dsa_Mathematics;
import java.util.Scanner;
public class Computing_Power {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the no = ");
		int x = scn.nextInt();
		System.out.print("Enter the power = ");
		int p = scn.nextInt();
		scn.close();
		
		System.out.println("The "+p+" 's "+ "Power of "+x+" is "+ computingPower(x , p));

	}

//	  static int computingPower(int x, int p) {
//		if(p==0) return 1;
//		int result = 1;
//		for(int i =1; i<=p; i++) {           // This is the simple solution //
//			result = result * x;
//		}
//		return result;
//	}
	
	static int computingPower(int x, int p) {
		if(p==0) return 1;
		int temp = computingPower(x, p/2);
		temp = temp * temp;
		if(p%2==0) {                                     // This is the efficient solution //
			return (temp);
		}else {
			return (temp*x);
		}
		
	}

}
