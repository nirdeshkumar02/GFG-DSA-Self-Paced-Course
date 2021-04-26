package F_Dsa_Searching;

public class search_in_rotated_array {

	public static void main(String[] args) {
		int arr[] = {100,200,300,400,10,50};
		int n = arr.length;
		int key = 200;
		System.out.println(search(arr, key, n));

	}

	private static int search(int[] arr, int key, int n) {
		int low = 0, high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[low]<arr[mid]) {
				if(key >= arr[low] && key <  arr[mid])
					high = mid-1;
				else
					low= mid+1;
			}
			else {
				if(key> arr[mid] && key<= arr[high])
					low = mid+1;
				else
					high = mid-1;
			}
		}
		return -1;
	}

//	private static int search(int[] arr, int key, int n) {
//		for(int i =0; i< n; i++)          
//			if(arr[i]==key)                       // naive solution
//				return i;
//		return -1;
//	}

}
