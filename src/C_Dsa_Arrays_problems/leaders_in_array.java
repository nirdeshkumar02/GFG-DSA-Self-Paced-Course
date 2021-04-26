package C_Dsa_Arrays_problems;

public class leaders_in_array {

	public static void main(String[] args) {
		
		int arr[] = {10,2,5,8,6,1};
		int length = arr.length;
		leaders(arr,length);

	}
//           static void leaders(int arr[], int length) {
//        	   int j;
//        	   for(int i = 0; i< length; i++) {
//        		   for( j= i+1; j<length; j++) {
//        			   if(arr[i]<arr[j])
//        				   break;                         naive solution
//        		   }
//        		   if(j==length) {
//        			   System.out.println(arr[i]+" ");
//        		   }
//        	   }
//           }

	 static void leaders(int[] arr, int length) {
		int leader = arr[length-1];
		
		System.out.println(leader+" ");
		
		for(int i = length-2; i>=0; i--) 
		{
			if(leader <= arr[i]) {
				leader = arr[i];
				System.out.println(leader+" ");
		}
		
	}
		}
}
	

