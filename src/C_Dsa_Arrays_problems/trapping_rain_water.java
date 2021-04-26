package C_Dsa_Arrays_problems;

public class trapping_rain_water {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int length = arr.length;
		
		length = trappingWater(arr,length);
           System.out.println("The trapping water is = "+length);
	}

	 static int trappingWater(int[] arr, int n) {
		int result = 0;
		int lmax [] = new int[n];
		int rmax [] = new int[n];
		
		lmax [0] = arr[0]; rmax[n-1] = arr[n-1];
		for(int i=1; i<n; i++) {
			lmax [i] = Math.max(arr[i], lmax[i-1]);
		}
		for(int i = n-2; i>=0; i--) {
			rmax[i] = Math.max(arr[i],rmax[i+1]);
		}
		for(int i =1; i<n-1; i++) {
			result += (Math.min(lmax[i], rmax[i])-arr[i]);
		}
		return result;
	}

}
