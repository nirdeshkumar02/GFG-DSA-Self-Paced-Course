package E_Dsa_Matrix;

public class matrix_boundry_traversal {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		bTraversal(arr);
	}

	public static void bTraversal(int[][] arr) {
		int r = 4, c = 4;
		if(r==1) {
			for(int i = 0; i<c; i++)
				System.out.print(arr[0][i]+" ");
		}
		else if(c==1) {
			for(int i = 0; i< r; i++)
				System.out.print(arr[i][0]+" ");
		}
		else {
			for(int i=0; i<c; i++)
				System.out.print(arr[0][i]+" ");
			for(int i= 1; i<r;i++)
				System.out.print(arr[i][c-1]+" ");
			for(int i = c-2; i>=0; i--)
				System.out.print(arr[r-1][i]+" ");
			for(int i = r-2; i>=1; i--)
				System.out.print(arr[i][0]+" ");
		}
		
	}

}
