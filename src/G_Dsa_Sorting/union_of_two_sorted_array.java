package G_Dsa_Sorting;

public class union_of_two_sorted_array {

	public static void main(String[] args) {
		int a[] = {3,8,10,12,15};
		int b[] = {5,7,11,13,17,19,20};
		int m = a.length;
		int n = b.length;
		int c[] =new int [m+n];
		
		System.out.println("The array a = ");
		for(int i=0; i<m; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("The array b = ");
		for(int j=0; j<n; j++) {
			System.out.print(b[j]+" ");
		}
		System.out.println();
		
		System.out.println("The union of arrays are = ");
		union(a,b,c,m,n);
		
	}

	private static void union(int[] a, int[] b, int[] c, int m, int n) {
		int i=0,j=0;
		while(i<m && j<n) {
			if(i>0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j] == b[j-1]) {
				j++;
				continue;
			}
			if(a[i] < b[j]) {
				System.out.println(a[i]+" ");
				i++;
			}
			else if(a[i]>b[j]) {
				System.out.println(b[j]+" ");
				j++;
			}
			else {
				System.out.println(a[i]+" ");
				i++;
				j++;
			}
		}
		while(i<m) {
			if(i==0 || a[i] != a[i-1]) {
				System.out.println(a[i]+" ");
				i++;
			}
		}
		while(j<n) {
			if(j==0 || b[j] != b[j-1]) {
				System.out.println(b[j]+" ");
				j++;
			}
		}
		
	}

//	private static void union(int[] a, int[] b, int[] c, int m, int n) {
//		for(int i =0; i<m; i++)
//			c[i] = a[i];
//		for(int i = 0; i<n; i++)
//			c[i+m] = b[i];                           // naive solution //
//		Arrays.sort(c);
//		for(int k=0; k<m+n; k++) {
//		if(k==0 || c[k] != c[k-1])
//			System.out.print(c[k]+" ");
//		}
//		System.out.println();	
//	}

}
