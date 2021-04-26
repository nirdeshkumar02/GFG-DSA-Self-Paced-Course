package G_Dsa_Sorting;

public class merge_sorts_and_function {

	public static void main(String[] args) {
		int arr[] = {10,15,20,40,8,11,15,20,25};
		int l = 0, r = arr.length-1;
		System.out.println("The array is = ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		System.out.println("The sorted array = ");
		MergeSort(arr,l,r);
	        for (int i = 0; i <= r; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 

	}

	private static void MergeSort(int[] arr, int l, int r) {
		if(r>l) {
			int m = l+(r-l)/2;
			MergeSort(arr,l,m);        //Merge Sort Function//
			MergeSort(arr,m+1,r);
			Merge(arr,l,m,r);
		}
		
	}

	private static void Merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1; int n2 = r-m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i = 0; i<n1; i++)
			left[i] = arr[l+i];
		for(int j = 0; j<n2; j++)
			right[j] = arr[m+1+j];
		
		int i =0, j=0, k =l;
		
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {             // Merge Function//
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1)
			arr[k++] = left[i++];
		while(j<n2)
			arr[k++] = right[j++];
	}
}
