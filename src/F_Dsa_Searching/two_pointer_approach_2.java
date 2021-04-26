package F_Dsa_Searching;

public class two_pointer_approach_2 {

	public static void main(String[] args) {
		int arr[] = {2,3,7,8,11};
		int n = arr.length;
		int sum = 14;
		System.out.println(isPresent(arr,n,sum));

	}

	private static int isPresent(int[] arr, int n, int sum) {
		int l = 0; int r = n-1;
		while(l<=r) {
			if(arr[l]+arr[r] == sum)
				return 1;
			else if(arr[l] + arr[r] > sum)
				r--;
			else
				l++;
		}
		return 0;
	}

}
