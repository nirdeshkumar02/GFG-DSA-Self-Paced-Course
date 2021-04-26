package F_Dsa_Searching;

public class search_infinite_sized_array {

	public static void main(String[] args) {
		int arr[] = {1,10,15,20,40,50,90};
		int key = 90;
		int n = arr.length;
		int l = 0;
		int r = n-1;
		System.out.println(searchelement(arr,key,n,l,r));

	}

	private static int searchelement(int[] arr, int key, int n, int l, int r) {
		if(arr[0]==key)
			return 0;
		int i = 1;
		while(arr[i]<key) 
			i = i*2;
		if(arr[i] == key)
			return i;
		
		return bsearch(arr,i/2,i-1,key);
	}

	private static int bsearch(int[] arr, int key, int l, int r) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid] == key) {
				return mid;
			}
				
			else if(arr[mid]>key) {
				return bsearch(arr, key,  l, mid-1);
			}
				
			else {
				return bsearch(arr, key,  mid+1, r);
			}
				
		}
		return -1;
		
	}

//	private static int searchelement(int[] arr, int key, int n, int l, int r) {
//	int i = 0;
//	while(true) {
//		if(arr[i] == key) return i;
//		if(arr[i]> key) return -1;                //naive solution
//		i++;
//	}
//		
//	}

}
