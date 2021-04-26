package D_Dsa_Bit_Magic;

public class two_odd_occurence {

	public static void main(String[] args) {
		
		int arr[] = {3,4,4,3,5,4,4,6,7,7};
		int n = arr.length;
		oddAppear(arr,n);

	}

	public static void oddAppear(int[] arr, int n) {
		int xor = 0, result1 = 0, result2 =0; 
		for(int i = 0; i < n; i++) 
			xor = xor ^ arr[i];
		int sn = xor & (~(xor-1));
		for(int i = 0; i< n; i++) {
			if((arr[i]&sn)!=0)
				result1 = result1 ^ arr[i];
			else
				result2 = result2 ^ arr[i];
		}
		System.out.println(result1 +" "+result2);
	}

}
