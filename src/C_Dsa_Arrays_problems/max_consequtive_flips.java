package C_Dsa_Arrays_problems;

public class max_consequtive_flips {

	public static void main(String[] args) {
		
		int arr[] = {1,0,0,0,1,0,0,1,1,1,1};
		int length = arr.length;
		
		
		System.out.println("The maximum consequtive flips are = ");
		 consequtiveFlip(arr, length);
	}

	 static void consequtiveFlip(int[] arr, int n) {
		for(int i =1; i<n; i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) {
					System.out.print(" from "+i+" to ");
				}
				else {
					System.out.print(i-1);
				}
			}
			
		}
		if(arr[n-1]!=arr[0])
			System.out.println(n-1);
		
	}

}
