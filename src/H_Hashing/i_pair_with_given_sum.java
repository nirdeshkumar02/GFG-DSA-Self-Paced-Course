package H_Hashing;
import java.util.*;
public class i_pair_with_given_sum {

	public static void main(String[] args) {
		int arr[] = {3,2,8,15,-8};
		int n = arr.length;
		int sum = 17;
		System.out.println("Pair with sum = "+pairSum(arr,n,sum));

	}

	private static boolean pairSum(int[] arr, int n, int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i =0; i<n; i++) {
			if(s.contains(sum - arr[i]))
				return true;
			s.add(arr[i]);
			}
		
		return false;
	}

}
