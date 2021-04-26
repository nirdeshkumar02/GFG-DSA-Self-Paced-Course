package F_Dsa_Searching;

public class binary_search {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,82,69};
		int x = 5;
		int n = arr.length;
		int l = 0, r = n-1;
		System.out.println(bsearch(arr,l,r,x));
//		while(l<=r) {
//			int m = (l+r)/2;
//			if(arr[m]==x) {
//				System.out.println("Found at index("+m+")");   // iterative solution
//				break;
//			}
//			else if(arr[m]>x) {
//				r = m-1;
//			}
//			else {
//				l = m+1;
//			}
//		}

	}

	private static int bsearch(int[] arr, int l, int r, int x) {
		if(l>r)
			return -1;
		int mid = (l+r)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]>x)
		return bsearch(arr, l, mid-1, x);               // recursive solution
		else
			return bsearch(arr, mid+1, r, x);
		
		
	}

}
