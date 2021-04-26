package G_Dsa_Sorting;

public class Merge_two_Sorted_array {

	public static void main(String[] args) {
		int a[] = {10,15,20,40};
		int b[] = {5,6,6,10,15};
		int m = a.length;
		int n = b.length;
		int c[] = new int[m+n];
		
	// Print the array of a//
		System.out.println("The array a = ");
		for(int element : a)
			System.out.print(element+" ");
		System.out.println();
	//Print the array of b//
		System.out.println("The array b = ");
		for(int element1 : b)
			System.out.print(element1+" ");
		System.out.println();
		
		// Print the sorted array//
		System.out.println("The merge array  = ");
		
	// mergesort function used//
		mergeArray(a, b, c, m, n);
	
		
//		for(int element3 : c)
//			System.out.print(element3+" ");
//		System.out.println();
//	}
}
	
	/////////////////////////////////////////Efficient Solution/////////////////////////////////////////////////////

	private static void mergeArray(int[] a, int[] b, int[] c, int m, int n) {
		int i = 0; int j = 0;
		while(i<m && j<n) {
			if(a[i] < b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}
			else {
				System.out.print(b[j]+" ");
				j++;
			}
		}
		while(i<m) {
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n) {
			System.out.print(b[j]+" ");
			j++;
		}	
	}
	
	///////////////////////////////////////Naive Solution///////////////////////////////////////////////////////////////////

//	private static void mergeArray(int[] a, int[] b, int[] c, int m, int n) {
//		for(int i = 0; i<m ; i++) {
//			c[i] = a[i];
//		}
//		
//		for(int j=0 ; j<n; j++) {             // Naive solution//
//			c[j+m] = b[j];
//		}
//		
//		Arrays.sort(c);
//	}
			
}
