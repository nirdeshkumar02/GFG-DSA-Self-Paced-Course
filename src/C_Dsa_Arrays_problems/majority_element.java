package C_Dsa_Arrays_problems;

public class majority_element {

	public static void main(String[] args) {
		
		int arr[]= {8,3,4,8,8};
		int length = arr.length;
		int findMajority = findMajority(arr, length);
		System.out.println("The majority element = "+findMajority);

	}

	 static int findMajority(int[] arr, int n) {
	   int result = 0;
	   int count = 1;
	   for(int i=1; i< n; i++) {
		   if(arr[result]==arr[i]) {
			   count++;
		   }else {
			   count--;                                        // wrong soltution try it (moores voting algo)
		   }
		   if(count==0) {
			   result = i;
			   count = 1;
		   }
		   
	   }
	   count = 0;
	   for(int i=0; i< n; i++) {
		   if(arr[result]==arr[i]) {
			   count++;
		   }
		   if(count<=n/2) {
			   result = -1;
		   }
	   }
		return result;
	}

}
