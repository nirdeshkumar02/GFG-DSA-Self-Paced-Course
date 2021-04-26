package G_Dsa_Sorting;

public class Naive_Partition {

	public static void main(String[] args) {
		int arr[] = {3,8,6,12,10,7};
		int n = arr.length;
		int l =0; int h= n-1; int p =5;
		System.out.println("the array is = ");
		for(int i =0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		partition(arr,l,h,p);
		for(int element :arr)
			System.out.print(element+" ");
	}

	private static void partition(int[] arr, int l, int h, int p) {
		int temp[] = new int [h-l+1];
		int index = 0;
		
		for(int i =l; i<=h; i++) {
			if(arr[i] <= arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		for(int i=l; i<=h; i++) {
			if(arr[i]>arr[p]) {
				temp[index] = arr[i];
						index++;
			}
		}
		for(int i=l; i<=h; i++)
			arr[i] = temp[i-l];
	}

}
