package C_Dsa_Arrays_problems;

public class n_bonnaci_series {

	public static void main(String[] args) {
		int n = 4;
		int m = 10;
		nbonnaciSeries(n,m);
	}
	                                                                    // Sliding Window Techniques
	 static void nbonnaciSeries(int n, int m) {
		int a[] = new int[m];
		for(int i =0; i<m; i++)
	        a[i] = 0;
		 a[n-1] = 1;
		 a[n] =1;
		 for(int i = n+1; i<m; i++) {
			 a[i] = 2*a[i-1] - a[i-n-1];
		 }
		for(int i = 0; i< m; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
