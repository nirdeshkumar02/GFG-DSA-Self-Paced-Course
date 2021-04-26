package E_Dsa_Matrix;

public class search_in_row_wise_column_wise {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int x = 11; int r =4; int c = 4; 
		search(arr,x,r,c);
		

	}

	public static void search(int[][] arr, int x, int r, int c) {
		int i = 0; int j=c-1;
		while(i<r && j>=0) {
			if(arr[i][j]==x) {
				System.out.println("Found at("+i+","+j+")");          //efficient solution
				return;
			}else if(arr[i][j]>x) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("Not Found");
		
	}

//	public static void search(int[][] arr, int x) {
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j< arr[i].length; j++) {
//				if(arr[i][j]==x) {
//					System.out.println("Found at("+i+","+j+")");   // naive solution
//					return;
//				}
//			}
//		}
//		System.out.println();
//		
//	}
	
	

}
