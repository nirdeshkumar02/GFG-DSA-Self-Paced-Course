package C_Dsa_Arrays_problems;
import java.util.*;
public class left_rotate_by_D_Places {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
		int arr[] = {10,20,30,40,50};
		int n = arr.length;
		System.out.print("Enter the left shift places = ");
		int d = scn.nextInt();
		scn.close();
		leftRotate(arr,n,d);
		System.out.println("The new array = ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}
		

	}

//	 static void leftRotate(int[] arr, int n, int d) {
//		for(int i=0; i < d; i++) {
//			leftRotate(arr,n);
//		}
//		
//	}
//                                                       // This is the naive solution
//	 static void leftRotate(int[] arr, int n) {
//	  int temp = arr[0];
//	  for(int i = 1; i < n; i++) {
//		  arr[i-1] = arr[i];
//	  }
//		arr[n-1] = temp;
//	}

	  static void leftRotate(int arr[], int n, int d) {
		  reverse(arr,0,d-1);
		  reverse(arr,d,n-1);
		  reverse(arr,0,n-1);
	  }

     static void reverse(int[] arr, int low , int high) {
	int low1 = 0;
//	int high1 = n-1;
	while(low1 < high) {
		int temp = arr[low1];
		arr[low1] = arr[high];
		arr[high] = temp;
		low1++;
		high++;
	}
	
	//// cant solve in best case.
}
}
