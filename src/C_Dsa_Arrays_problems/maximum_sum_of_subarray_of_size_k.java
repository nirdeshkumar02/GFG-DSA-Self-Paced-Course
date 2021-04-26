package C_Dsa_Arrays_problems;

public class maximum_sum_of_subarray_of_size_k {

	public static void main(String[] args) {
	
		int arr[] = {5,-10,6,90,3};            // Sliding Window Techniques
		int length = arr.length;
		int k = 2;
		int subarraySum = subarraySum(arr,length,k);
		System.out.println("The sum of subarray of size "+k+" is = "+subarraySum);
	}

	 static int subarraySum(int[] arr, int n, int k) {
		if(n<k) {
			System.out.println("Invalid");
			return -1;
		}
		int result = 0;
		for(int i = 0; i<k;i++) {
			result += arr[i];
		}
		int curr_sum = result;
		for(int i = k; i< n; i++) {
			curr_sum += arr[i]-arr[i-k];
			result = Math.max(result, curr_sum);
		}
		return result;
	}

}
