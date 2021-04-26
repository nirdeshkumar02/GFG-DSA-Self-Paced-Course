package C_Dsa_Arrays_problems;

public class max_subarray_sum {

	public static void main(String[] args) {
		
		int arr[] = {5,8,3};
		int length = arr.length;
		int maxSubarraysum = maxSubarraysum(arr,length); 
        System.out.println("The maximum subarray sum = "+maxSubarraysum);
	}

	 static int maxSubarraysum(int[] arr, int n) {
		int result = arr[0];
		int max = arr[0];
		for(int i =1; i<n; i++) {
			max = Math.max(max+arr[i], arr[i]);
			result = Math.max(result, max);
		}
		return result;
	}

}
