package F_Dsa_Searching;

public class count_1_in_sorted {

	public static void main(String[] args) {
		int arr[] = {1,1,0,1,0,1,1,1};
		int n = arr.length;
		int l = 0; int r = n-1;
		System.out.println(count1(arr,n,l,r));
	}

	public static int count1(int[] arr, int n, int l, int r) {
	        
	        int low = 0, high = n-1;
	        
	        int mid = (low+high)/2;
	        
	        // Binary Search
	        while(low <= high){
	            
	            mid = (low + high)/2;
	            
	            // if mid is 1, then check for upper half
	            if(arr[mid] == 1 && mid+1 < n && arr[mid+1] == 1){
	                low = mid+1;
	            }
	            
	            // if mid is 0, then iterate for upper half
	            else if(arr[mid] == 0){
	                high = mid-1;
	            }
	            
	            // else, iterate for lower half
	            else if(arr[mid] == 1 && ((mid+1 < n && arr[mid+1] == 0) || (mid == n-1))){
	                return mid+1;
	            }
	            
	        }
	        return 0;
	        
	    }
	    
	}

//	private static int count1(int[] arr, int n, int l, int r) {
//		while(l<=r) {
//			int mid = (l+r)/2;
//			if(arr[mid] == 0)
//				l = mid +1;
//			else {                                 /// wrong solution
//				if(mid ==0 || arr[mid-1]==0)
//					return n-mid;
//				else
//					r = mid-1;
//			}
//		}
//		
//		return 0;
//		
//	}


