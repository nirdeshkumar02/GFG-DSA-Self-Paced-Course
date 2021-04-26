package C_Dsa_Arrays_problems;

public class max_diff_problem {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		int length = arr.length;
	    int maximum_Difference = maxDiff(arr,length);
               System.out.println(maximum_Difference);
	}

	 static int maxDiff(int[] arr, int n) {
		int result = arr[1] - arr[0];
		int min = arr[0];
		for(int i =1; i<n;i++) {
			result = Math.max(result, arr[i]-min);
			min = Math.min(min, arr[i]);
		}
		return result;
	}

}
