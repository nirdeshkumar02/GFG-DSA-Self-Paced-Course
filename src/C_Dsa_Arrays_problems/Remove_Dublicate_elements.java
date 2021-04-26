package C_Dsa_Arrays_problems;

public class Remove_Dublicate_elements {

	public static void main(String[] args) {
		
		
		int arr[] = {10, 20, 20, 30, 30, 30, 40, 50};
		 int length = arr.length;
		length = removeDublicate(arr, length);
		System.out.println("The new array is = ");
		for(int i = 0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
        
	}
//       static int removeDublicate(int arr[], int n)
//       {int temp[] = new int[n];
//       temp[0] = arr[0];
//       int result = 1;
//       for(int i = 1; i< n ; i++) {
//    	   if(temp[result-1] != arr[i]) {
//    		   temp[result] = arr[i];            // This is the naive solution where time complexity O(n) and Auxiliry space also same.
//    		   result++;
//    		   
//    	   }
//       }
//       for(int i = 0; i < result; i++) {
//    	   arr[i] = temp[i];
//       }
//       
//		return result;
	
	static int removeDublicate(int arr[], int n) {
		int result = 1;
		for(int i =1; i< n; i++) {
			if(arr[result-1] != arr[i]) {
				arr[result] = arr[i];                    // This is efficient solution
				result++;
			}
		}
		return result;  
       }
}
