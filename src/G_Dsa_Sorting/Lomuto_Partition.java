package G_Dsa_Sorting;

public class Lomuto_Partition {

	public static void main(String[] args) {
		int arr[] = {3,8,6,12,10,7};
		int n = arr.length;
		int l =0; int h= n-1; 
		System.out.println("the array is = ");
		for(int i =0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println(partition(arr,l,h));
		for(int element : arr) {
			System.out.println(element+" ");
		}
		

	}

	private static int partition(int[] arr, int l, int h) {
		 
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
	}

}
