package E_Dsa_Matrix;

public class Accessing_Element {

	public static void main(String[] args) {
		
	//	int [][]arr = new int[10][20]; 
		
		     // or
		
		int [][] arr = {{1,2},{3,4}};
		int n = arr.length;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
			}
		}

	}

}
