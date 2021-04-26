package C_Dsa_Arrays_problems;

public class longest_even_odd_sum {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7};
		int length = arr.length;
		
		int longestEvenOddSum = longestEvenOddSum(arr,length);
		System.out.println("The maximum subarray of even odd= "+longestEvenOddSum);
	}

	 static int longestEvenOddSum(int[] arr, int n) {
		int result = 1;
		int count = 1;
		for(int i = 1; i<n; i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2 != 0 && arr[i-1]%2==0)){
				count++;
				result = Math.max(result, count);
			}
			else {
				count=1;
			}
		}
		return result;
	}

}
