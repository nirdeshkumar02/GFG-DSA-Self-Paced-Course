package H_Hashing;
import java.util.*;
public class e_Count_Distinct_Element {

	public static void main(String[] args) {
//		int arr[] = {10,20,10,15,30,10};
		Integer arr[] = {10,20,10,15,30,10};
		Integer n = arr.length;
		System.out.println("Distinct Element = "+ countDistinct(arr,n));
		}
			// efficient solution having time complexity of O(n) and aux space O(n)
	
	private static int countDistinct(Integer[] arr, Integer n) {
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
		return hs.size();
	}

//	private static int countDistinct(int[] arr, int n) {
//		Set<Integer>hs = new HashSet<>();
//		for(int i =0; i<n; i++)
//			hs.add(arr[i]);            // efficient solution having time complexity of O(n)
//		return hs.size();
//	}

//	private static int countDistinct(int[] arr, int n) {
//		int result =0;
//		for(int i = 0; i<n; i++) {
//			boolean flag = false;
//			for(int j =0; j<i; j++) {
//				if(arr[i]==arr[j]) {
//					flag = true;
//					break;
//				}                                  // naive solution having time complexity of O(n2)
//			}
//			if(flag==false)
//				result++;
//		}
//		return result;
//	}

	}


