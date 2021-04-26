package H_Hashing;

import java.util.HashSet;

public class j_subarray_with_zero_sum {

	public static void main(String[] args) {
		int arr[] = {1,4,13,-3,-10,5};
		int n = arr.length;
		
		System.out.println("Subarray with zero sum = "+subarray(arr,n));

	}

	private static int subarray(int[] arr, int n) {
		HashSet<Integer> hs =new HashSet<Integer>();
		int curr_sum = 0;
		hs.add(0);
		for(int i=0; i<n; i++) {
			curr_sum += arr[i];
			if(hs.contains(curr_sum)==true)
				return 1;
			hs.add(curr_sum);
		}
		return 0;
	}

}
