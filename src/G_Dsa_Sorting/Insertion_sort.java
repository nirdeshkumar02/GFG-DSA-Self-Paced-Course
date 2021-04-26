package G_Dsa_Sorting;

public class Insertion_sort {

	public static void main(String[] args) {
		int arr[] = {90,80,70,60,50,40,30,20,10};
		int n = arr.length;
		System.out.println("Given Array is = ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();             // Insertion sort has O(n) time complexity in best case but in worst case//
		                                  // it has O(n^2) time complexity, this is a stable algorithm//
		InsertionSort(arr,n);
		System.out.println("Sorted Array is = ");
		for(int element2 : arr) {
			System.out.print(element2+" ");
		}
		System.out.println();

	}

	private static void InsertionSort(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =key;
		}
	}
}
