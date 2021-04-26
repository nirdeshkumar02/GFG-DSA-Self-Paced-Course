package E_Dsa_Matrix;

public class rotate_matrix_anticlockwise {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n = 4;
		rotate(arr,n);
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
		
				
		

	}

	public static void rotate(int[][] arr, int n) {
		for(int i = 0; i< n; i++)
			for(int j = i+1; j< n; j++)
				swap(arr, i, j);
		
		for(int i = 0; i< n; i++) {
			int low = 0; int high = n-1;
			while(low<high) {
				swap2(low, high, i, arr);
				low++;
				high--;
			}
		}
			
		
	}

	public static void swap2(int low, int high, int i, int[][] arr) {
		int temp = arr[low][i];
		arr[low][i] = arr[high][i];
		arr[high][i] = temp;
		
	}

	public static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
		
	}

//	public static void rotate(int[][] arr, int n) {
//		int temp[][] = new int[n][n];
//		for(int i =0; i<n; i++)
//			for(int j =0; j<n; j++)
//				temp[n-j-1][i] = arr[i][j];           // naive solution
//		
//		for(int i = 0; i<n; i++)
//			for(int j = 0; j<n; j++)
//				arr[i][j] = temp[i][j];
//				
//		
	
	}


