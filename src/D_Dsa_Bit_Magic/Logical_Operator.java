package D_Dsa_Bit_Magic;

public class Logical_Operator {

	public static void main(String[] args) {
		
//		int x = 6;
//		int y = 3;
//		System.out.println(x&y);          // and operator
//		
//		System.out.println(x|y);           // or operator
//		
//		System.out.println(x^y);          // xor operator
//		
//		System.out.println(~x);           // not operator
//		
//		System.out.println(x<<1);        // left shift operator
//		
//		System.out.println(x>>1);           // right shift opearator
//
//		System.out.println(x>>>1);        // right shift unsigned operator
		
		int arr[] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
		int n= arr.length;
		int x = arr[0];
		for(int i =1; i<n; i++) {
			x = x ^ arr[i];
			System.out.println(x);
		}
		
	}

}
