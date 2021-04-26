package F_Dsa_Searching;
import java.util.*;
public class ternary_search {

	public static void main(String[] args) {
		int arr[] = {1,2,5,9,14,56,84,99};
		int n = arr.length;
		int key = 84 ; int l = 0; int r = n-1;
		System.out.println(key +" Found at index = "+Arrays.binarySearch(arr, key));
		System.out.println(ternarysearch(arr, l, r, key));
	}

	private static int ternarysearch(int[] arr, int l, int r, int key) {
		while(r>=l) {
			int mid1 = l+(r-l)/3;
			int mid2 = r-(r-l)/3;
			if(arr[mid1]==key) {
				return mid1;
			}
			if(arr[mid2]==key) {
				return mid2;
			}
				
			if(key<arr[mid1]) {
				r = mid1-1;
			}
				
			else if(key>arr[mid2]) {
				l = mid2+1;
			}
				
			else {
				l = mid1+1;
				r = mid2-1;
			}
		}
		return -1;
	}

}
