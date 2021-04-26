package C_Dsa_Arrays_problems;
import java.util.*;
public class check_if_array_sorted {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value in array = ");
		for(int i = 0; i<n ; i++) 
		{
			arr[i] = scn.nextInt();
		}
		scn.close();
		System.out.println("The given array is sorted : true or flase = ");
		System.out.println(checkSortedArray(arr));
		
		

	}

	static boolean checkSortedArray(int[] arr) 
	{ for(int i = 1; i< arr.length; i++) {
		if(arr[i] < arr[i-1])                    // This is the effiecient solution of O(n).
			return false;
	}
		
		return true;
	}

//       static boolean checkSortedArray(int[] arr) 
//       { for(int i = 0; i<arr.length; i++) 
//         {  for(int j = i+1; j< arr.length; j++)        // This is the naive solution of O(n^2).
//             if(arr[j]<arr[i]) 
//            	 return false;
//		
//		
//	}
//	return true;
//
//}
	
	
       }

