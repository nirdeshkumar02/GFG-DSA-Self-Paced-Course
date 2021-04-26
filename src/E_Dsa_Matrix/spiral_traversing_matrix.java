package E_Dsa_Matrix;

public class spiral_traversing_matrix {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		spiralTraverse(arr,4,4);
		
		

	}

	public static void spiralTraverse(int[][] arr, int r, int c) {
		int left = 0; int right = c-1; int top = 0; int bottom = r-1;
		while(top<=bottom && left<=right) {
			for(int i = left; i<= right; i++)
				System.out.print(arr[top][i]+" ");
			top++;
			
			for(int i = top; i<= bottom; i++)
				System.out.print(arr[i][right]+" ");
			right--;
			
			if(top<=bottom) {
				for(int i = right; i>= left; i--)
					System.out.print(arr[bottom][i]+" ");
				bottom--;
			}
			
			if(left<=right) {
				for(int i = bottom; i>= top; i--)
					System.out.print(arr[i][left]+" ");
				left++;
			}
		}
	}

}
