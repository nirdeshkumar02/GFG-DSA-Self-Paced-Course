package C_Dsa_Arrays_problems;

public class maximun_consequtive_1 {

	public static void main(String[] args) {
		
		int arr[] = {1,0,1,1,1,1,0,1,1,0};
		int length = arr.length;
		length = maxConsecutive(arr,length);
		System.out.println("The Consequtive 1's in this array = "+length);
		
		
		
}

	 static int maxConsecutive(int[] arr, int n) {
		 int count =0; int result=0;
		 for(int i=0; i<n;i++) {
			 if(arr[i]==0) {
				 count=0;
			 }
			 else {
				 count++;
				 result = Math.max(result, count);
			 }
		 }
		return result;
	}
}
