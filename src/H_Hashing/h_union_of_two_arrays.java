package H_Hashing;
import java.util.*;
public class h_union_of_two_arrays {

	public static void main(String[] args) {
		int a[] = {10,15,20,25};
		int b[] = {15,18,20,22,25};
		int m = a.length;
		int n = b.length;
		
		System.out.println("The union of array = "+union(a,b,m,n));

	}

	private static int union(int[] a, int[] b, int m, int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i = 0; i<m; i++)
			s.add(a[i]);
		for(int j = 0; j<n; j++)
			s.add(b[j]);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
		return s.size();
	}

}
