package H_Hashing;

import java.util.HashSet;

public class k_subarrray_with_given_sum {

	public static void main(String[] args) {
		int arr[] = {5,8,6,13,3,-1};
		int n = arr.length;
		int sum= 22;
		System.out.println("Is there a subarray  with given sum = "+subarray(arr,n,sum));
	}

	private static boolean subarray(int[] arr, int n, int sum) {
//		for(int i =0; i<n; i++) {
//			int curr_sum =0;
//			for(int j =i; j<n; j++) {
//				curr_sum += arr[j];
//				if(curr_sum == sum)         naive solution
//					return true;
//			}
//		}
//		return false;
//	}

		HashSet<Integer> s = new HashSet<Integer>();
		int pre_sum =0;
		for(int i =0; i<n; i++) {
			if(pre_sum==sum)
				return true;
			pre_sum += arr[i];
			if(s.contains(pre_sum-sum)==true)
				return true;
			s.add(pre_sum);
		}
		return false;
		
}
}
