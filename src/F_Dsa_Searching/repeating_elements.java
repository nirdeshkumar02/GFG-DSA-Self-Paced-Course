package F_Dsa_Searching;

public class repeating_elements {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,5};
		int n = arr.length;
		System.out.println(repeatElements(arr,n));

	}

	private static int repeatElements(int[] arr, int n) {
		int slow = arr[0], fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[fast];
		}
		while(slow != fast); 
			slow = arr[0];
			while(slow != fast) {
				slow = arr[slow];
				fast = arr[fast];
			}
		return slow;
	}

//	private static int repeatElements(int[] arr, int n) {
//		boolean visited[] = new boolean[n];
//		for(int i = 0; i<n; i++) {
//			if(visited[arr[i]])                 effiecient solution with approach O(n) & O(n)
//				return arr[i];
//			visited[arr[i]] = true;
//		}
//		return -1;
//	}
	
	

}
