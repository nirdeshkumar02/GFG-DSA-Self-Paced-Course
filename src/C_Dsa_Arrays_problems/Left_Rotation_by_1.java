package C_Dsa_Arrays_problems;

public class Left_Rotation_by_1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int n = arr.length;
		leftRotation(arr, n);
		System.out.print("The new array is = ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}
	}

	 static void leftRotation(int[] arr, int n) {
		int temp = arr[0];
		for(int i = 1; i < n ; i++) {
			arr[i-1]= arr[i];
		}
		arr[n-1] = temp;
	}

}
