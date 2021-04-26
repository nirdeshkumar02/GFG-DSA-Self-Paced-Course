package D_Dsa_Bit_Magic;
import java.util.*;
public class Count_set_bit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the integer value = ");
		int n = scn.nextInt();
		
		int result = 0;
		scn.close();
		
//		while(n>0) {
//			if(n%2 != 0)
//				result++;              // this is in normal way// naive solurion
//			n = n/2;
//		}
//		System.out.println(result);

//	------------------------------------------------------------------------------------------------
		
//		while(n>0) {
//			result = result + (n&1);
//			n=n/2;                           // this is in operator way// naive solurion
//		}
//		System.out.println(result);
//	}

//  --------------------------------------------------------------------------------------------
		
		// BRAIN & Kerningham Algorithm //  this is more efficient then naive
		
		while(n>0) {
			n = (n&(n-1));
			result++;
		}
		System.out.println(result);
		
//     -----------------------------------------------------------------------------------------------------
		
		
		
}

	}

