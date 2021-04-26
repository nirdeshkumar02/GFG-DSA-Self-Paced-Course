package D_Dsa_Bit_Magic;

public class odd_occurence {

	public static void main(String[] args) {
		
		int arr[] = {8,7,7,8,8};
		int n = arr.length;
		System.out.println(oddOccur(arr,n));

	}

	public static int oddOccur(int[] arr, int n) {
		int result = 0;
		for(int i = 0; i<n; i++) {               // efficient solution
			result = result ^ arr[i];
		}
		return result;
	}



//	public static int oddOccur(int arr[], int n) {
//		int count = 0;
//		for(int i =0; i< n ; i++) {
//			for(int j = 0; j<n; j++) {
//				if(arr[i] == arr[j])
//					count++;                          // naive solution
//			}
//			if(count %2 != 0)
//				return arr[i];
//		}
//		return -1;
//	}

	
	
}
