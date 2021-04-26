package C_Dsa_Arrays_problems;

public class find_equilibrium_point_in_array {

	public static void main(String[] args) {
		int arr[] = {3,4,8,-9,20,6};
		
		int length = arr.length;
		System.out.println("First equilibrium index is = "+equilibrium(arr,length));

	}                                            

	 static int equilibrium(int[] arr, int n) {
		int sum = 0;
		int left_sum = 0;
		for(int i =0; i < n; ++i) 
			sum += arr[i];
		for(int i=0; i< n; ++i) {
			sum -= arr[i];
			if(left_sum==sum) 
				return arr[i];
			left_sum += arr[i];		
		}
		
		return -1;
	}

}
