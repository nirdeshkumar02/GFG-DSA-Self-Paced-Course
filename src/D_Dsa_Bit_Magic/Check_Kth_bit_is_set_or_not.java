package D_Dsa_Bit_Magic;
import java.util.*;
public class Check_Kth_bit_is_set_or_not {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
         System.out.println("Enter the integer value = ");
		int n = scn.nextInt();
		System.out.println("Enter the position = ");
		int k = scn.nextInt();
		scn.close();
		
//		if((n&(1<<(k-1)))==1) {
//			System.out.println("Set");
//	}                                              // by left shift operator
//		else {
//			System.out.println("Not Set");
//		}

		
		if(((n>>(k-1))&1)==1) {
			System.out.println("Set");
	}                                              // by right shift operator
		else {
			System.out.println("Not Set");
		}
}
}
