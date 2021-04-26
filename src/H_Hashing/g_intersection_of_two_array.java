package H_Hashing;
import java.util.*;
public class g_intersection_of_two_array {

	public static void main(String[] args) {
		int arr1[] = {10,15,20,15,30,30,5};
		int arr2[] = {30,5,30,80};
		int m = arr1.length;
		int n = arr2.length;
		
		System.out.println("Intersection Elements are = "+Intersection(arr1,arr2,m,n));

	}

	private static int Intersection(int[] arr1, int[] arr2, int m, int n) {
		HashSet<Integer>s = new HashSet<Integer>();
		for(int i =0; i<m; i++)
			s.add(arr1[i]);
		int result =0;
		for(int j =0; j<n; j++) {
			if(s.contains(arr2[j])) {
				result++;
				s.remove(arr2[j]);
			}
		}
		return result;
	}

//	private static int Intersection(int[] arr1, int[] arr2, int m, int n) {
//		int result = 0;
//		for(int i = 0; i< m; i++) {
//			boolean flag = false;
//			for(int j = 0; j<i-1; j++) {
//				if(arr1[i] == arr1[j]) {
//					flag = true;
//					break;
//				}
//				if(flag == true)          naive solution
//					continue;
//			}
//		for(int j=0; j<n; j++) {
//			if(arr1[i] == arr2[j]) {
//				result++;
//				break;
//			}
//		}
//		}
//		return result;
//	}

}
