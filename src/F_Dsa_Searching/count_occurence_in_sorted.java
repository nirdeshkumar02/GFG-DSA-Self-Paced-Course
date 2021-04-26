package F_Dsa_Searching;

public class count_occurence_in_sorted {

	public static void main(String[] args) {
		int arr[] = {10,10,20,20,20,30,30,40,40};
		int n = arr.length;
		int l = 0; int r = n-1; int key = 20;
		System.out.println(countOccur(arr,n,l,r,key));

	}

	private static int countOccur(int[] arr, int n, int l, int r, int key) {
		int first = firstOccur(arr,n,l,r,key);
		if(first == -1)
			return 0;
		else
		return lastOcuur(arr,n,l,r,key)-first+1;
	}

	private static int lastOcuur(int[] arr, int n, int l, int r, int key) {
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

	private static int firstOccur(int[] arr, int n, int l, int r, int key) {
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
