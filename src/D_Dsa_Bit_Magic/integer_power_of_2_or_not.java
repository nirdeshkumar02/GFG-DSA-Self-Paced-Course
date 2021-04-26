package D_Dsa_Bit_Magic;

public class integer_power_of_2_or_not {

	public static void main(String[] args) {
		
		int n = 6;
		System.out.println(isPow2(n));

	}

	public static boolean isPow2(int n) {
		if(n==0)
			return true;                     // effiecient solution
		return ((n&(n-1))==0);
	}

//	public static boolean isPow2(int n) {
//		if(n==0)
//			return true;
//		while(n != 1) {                   // naive solution
//			if(n%2 != 0)
//				return false;
//			n=n/2;
//		}
//		
//		return true;
//	}

}
