package C_Dsa_Arrays_problems;

public class program_for_multiple_queries_of_sum {

	public static void main(String[] args) {
		
		int arr[] = {2,8,3,9,6,5,4};
		int n = arr.length;
		int prefix_sum[] = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print(prefix_sum[i]+" ");
			System.out.println();
			fillprefix_sum(prefix_sum, n,arr);
			int a = 0; int b = 2;
			
			get_sum(prefix_sum, a, b);
			
		}
                                           // Prefix sum techniques
	}

	  static void get_sum(int[] prefix_sum, int a, int b) {
		  int sum=0;
		if(a!=0) {
			sum = prefix_sum[b]-prefix_sum[a-1];
			System.out.println(sum);
		}
		else {
			sum = prefix_sum[b];
		}
		 
	}

	static void fillprefix_sum(int[] prefix_sum, int n, int[] arr) {
		prefix_sum[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefix_sum[i] = prefix_sum[i-1]+arr[i];
		}
		
	}

}
