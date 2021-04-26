package H_Hashing;

public class l_longest_array_with_given_sum {

	public static void main(String[] args) {
		int arr[] = {5,8,-4,-4,9,-2,2};
		int n = arr.length;
		int sum = 0;
		
		System.out.println("Longest array with sum = "+longest(arr,n,sum));

	}

	private static int longest(int[] arr, int n, int sum) {
		int result = 0;
		for(int i=0; i<n; i++) {
			int curr_sum =0;
			for(int j =i; j<n; j++) {
				curr_sum += arr[j];
				if(curr_sum==sum) {
					result = Math.max(result, j-i+1);
				}
			}
		}
		return result;
	}

}
