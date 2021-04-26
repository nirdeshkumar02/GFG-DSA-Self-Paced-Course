package F_Dsa_Searching;

public class index_of_first_last_occurence_in_sorted {

	public static void main(String[] args) {
		
		int arr[] = {1,10,10,20,20,20,40};
		int n = arr.length;
		int l = 0, r=n-1, key= 20;
		System.out.println(firstOccur(arr,l,r,key, n));
		System.out.println(lastOccur(arr,l,r,key,n));
	}

	private static int lastOccur(int[] arr, int l, int r, int key,int n) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]>key) {
				r = mid-1;
			}
			else if(arr[mid]<key) {
				l = mid+1;
			}
			else {
				if((mid == n-1)||(arr[mid+1]!=arr[mid])) {
					return mid;
				}
				else
					l = mid+1;
			}
		}
		
		return -1;
	}

	private static int firstOccur(int[] arr, int l, int r, int key, int n) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]>key) {
				r = mid-1;
			}
			else if(arr[mid]<key) {
				l = mid+1;
			}
			else {
				if((mid == 0)||(arr[mid-1]!=arr[mid])) {
					return mid;
				}
				else
					r = mid-1;
			}
		}
		
		return -1;
	}

}
