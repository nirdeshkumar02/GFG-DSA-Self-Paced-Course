package C_Dsa_Arrays_problems;

public class max_circular_subarray_sum {

	public static void main(String[] args) {
		
		int arr[] = {5,-2,3,4};
		int length = arr.length;
		 
		 int circularAraySum = circularArraySum(arr, length);
            System.out.println("The sum of circular array sum = "+circularAraySum);
	}

	  static int circularArraySum(int[] arr, int n) {
		  int normalArraySum = normalArraySum(arr, n);
		  if(normalArraySum < 0) return normalArraySum;
		  int array_sum = 0;
		  for(int i =0; i< n; i++) {
			  array_sum += arr[i];
			  arr[i] = -arr[i];
		  }
		  int sum = array_sum + normalArraySum(arr, n);
		return Math.max(normalArraySum, sum);
	}

	static int normalArraySum(int[] arr, int n ) {
		int result = arr[0];
		int max = arr[0];
		for(int i = 1; i< n; i++) {                   // Standard Kaden's Algorithm
			max = Math.max(arr[i]+max, arr[i]);
			result = Math.max(result, max);
		}
		return result;
	}

	 
}
