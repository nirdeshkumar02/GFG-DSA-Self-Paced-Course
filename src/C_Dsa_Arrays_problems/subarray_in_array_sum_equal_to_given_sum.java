package C_Dsa_Arrays_problems;

public class subarray_in_array_sum_equal_to_given_sum {

	public static void main(String[] args) {
		int arr[]= {1,4,20,3,10,5};
		int length = arr.length;
		int sum = 33;
		int subArray = subArray(arr,length,sum);
		System.out.println(subArray);
	                                                	// Sliding Window Techniques
		

	}

	 static int subArray(int[] arr, int n, int sum) {
		int curr_sum = arr[0];
		int start = 0; int i;
		for( i =1; i<n; i++) {
			while(curr_sum > sum && start < i-1);
			{
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(curr_sum == sum) {
				int p = i-1;
				System.out.println("sum found between index "+start+" and "+p);
				return 1;
 			}
			if(i<n) curr_sum = curr_sum + arr[i];
			
		}
		System.out.println("no subarray found");
		return 0;
	}

}
