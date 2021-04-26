package F_Dsa_Searching;
import java.util.*;
public class two_pointer_approach_1 {
	
	// Find Pair in Unsorted Array which gives sum x //   it will use hashing technique

	public static void main(String[] args) {
		int arr[] = {1,4,45,6,10,8};
		
		int sum = 16;
		printPairs(arr,sum);

	}

	private static void printPairs(int[] arr, int sum) {
		HashSet<Integer> s =new HashSet <Integer>();
		for(int i =0; i< arr.length; i++) {
			int temp = sum - arr[i];
			if(s.contains(temp)) {
				System.out.println("Pairs with given sum"+ sum + " is("+arr[i]+" "+ temp+")");
			}
			s.add(arr[i]);
		}
		
	}

}
