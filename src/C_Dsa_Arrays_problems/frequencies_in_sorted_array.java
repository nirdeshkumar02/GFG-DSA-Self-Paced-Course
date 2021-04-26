package C_Dsa_Arrays_problems;

public class frequencies_in_sorted_array {

	public static void main(String[] args) {
		int arr [] = {1,1,1,1,1,5,3,3,2,5,4,1};
		int length = arr.length;
		
		int freq = 1; int i = 1;
		while(i<=length) {
			while(i<length && arr[i]==arr[i-1]) {
				freq++;
				i++;                                                 // efficient solution
			}
			System.out.println(arr[i-1]+" "+freq);
			freq = 1; i++;
		}
		
	}

		
}