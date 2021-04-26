package G_Dsa_Sorting;

import java.util.Arrays;
import java.util.Collections; 

public class Array_sort_function_use_in_non_premitive {

	public static void main(String[] args) {
		
	System.out.println("------------------------(Non - Premitive Type)-----------sort the int array------------------------------------------------------");
	System.out.println();
		
			int arr1[] = {5,20,12,30};
			int n1 = arr1.length;
			System.out.println("the array of integer = ");
			for(int i = 0; i<n1; i++) {
				System.out.print(arr1[i]+" ");	
			}
			System.out.println();
			Arrays.sort(arr1);                               // Here we use inbuilt function of array to sort//
			System.out.println("The sorted array1 = ");
			System.out.println(Arrays.toString(arr1));       // Here we print the sort array//
			System.out.println();
		
	System.out.println("----------------------------(Non - Premitive Type)---------sort the subarray of int array------------------------------------------------------");
	System.out.println();
		
			int arr2[] = {5,30,20,10,8};
			int n2 = arr2.length;
			System.out.println("The array of integer type = ");
			for(int i = 0; i< n2; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
			Arrays.sort(arr2, 1, 4);
			System.out.println("The sorted array = ");
			System.out.println(Arrays.toString(arr2));
			System.out.println();
			
	
	System.out.println("----------------------------(Non - Premitive Type)---------sort the char array------------------------------------------------------");
	System.out.println();
		
	    	char arr3[] = {'B','A','B','C','D'};
	    	int n3 = arr3.length;
	    	System.out.println("The array of char = ");
	    	for(int i = 0; i<n3; i++) {
	    		System.out.print(arr3[i]+" ");
	    	}
	    	System.out.println();
	    	Arrays.sort(arr3);
	    	System.out.println("The sorted array3 = ");
	    	System.out.println(Arrays.toString(arr3));
	    	System.out.println();
		
	System.out.println("----------------------------(Non - Premitive Type)---------sort the subarray of char array------------------------------------------------------");
	System.out.println();
	
			char arr4[] = {'B','A','X','V','P'};
			int n4 = arr4.length;
			System.out.println("The array of char type = ");
			for(int i = 0; i< n4; i++) {
				System.out.print(arr4[i]+" ");
			}
			System.out.println();
			Arrays.sort(arr4, 0, 5);
			System.out.println("The sorted array = ");
			System.out.println(Arrays.toString(arr4));
			System.out.println();
		
	System.out.println("----------------------------(Non - Premitive Type)---------sort the array in reverse order------------------------------------------------------");
	System.out.println();	
	
	
			Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
			Integer n = arr.length;
			System.out.println("The array of Integer type = ");
			for(Integer i = 0; i< n; i++) {
				System.out.print(arr[i]+" ");
			}                                       // here we use integer in place of int//
			System.out.println();                    // we use Collection to sort the array in reverse order//
			// Sorts arr[] in descending order 
			Arrays.sort(arr, Collections.reverseOrder()); 

			System.out.println("Modified arr[] = " +Arrays.toString(arr)); 
} 
}

