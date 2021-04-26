package G_Dsa_Sorting;

public class intersection_of_two_sorted {

	public static void main(String[] args) {
		int a[] = {2,5,8,13,15};
		int b[] = {1,3,8,15,18,20,25};
		int m = a.length;
		int n = b.length;
		System.out.println("The array a = ");
		for(int ele1 : a)
			System.out.print(ele1+" ");
		
		
		System.out.println("The array b = ");
		for(int ele2 : b)
			System.out.print(ele2+" ");
		
		
		System.out.println("The intersection point = ");
		intersection(a,b,m,n);
	}

	private static void intersection(int[] a, int[] b, int m, int n) {
		int i =0, j=0;
		while(i<n && j<m) {
			if(i>0 && a[i-1] == a[i]) {
				i++;
				continue;
			}
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i] > b[j]){
				j++;
			}
			else {
				System.out.println(a[i]+" ");
				i++; j++;
			}
		}
		
	}

//	private static void intersection(int[] a, int[] b, int m, int n) {
//		for(int i =0; i<m; i++) { 
//			if(i>0 && a[i-1] == a[i])
//				continue;
//		for(int j = 0; j<n;j++)                // Naive SOultion//
//			if(a[i]==b[j])
//				System.out.print(a[i]+" ");
//		}
//	}

}
