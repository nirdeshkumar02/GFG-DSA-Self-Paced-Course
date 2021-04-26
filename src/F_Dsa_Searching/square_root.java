package F_Dsa_Searching;
import java.util.*;
public class square_root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer = ");
		int n = sc.nextInt();
		System.out.println("The square root of integer = "+sqrt(n));
		sc.close();

	}

	private static int sqrt(int n) {
		int l = 1; int r =n; int ans = -1;
		while(l<=r) {
			int mid = (l+r)/2;
			int msq = mid*mid;
		if(msq == n)
			return mid;
		else if(msq>n)
			r = r-1;
		else {                                        // efficient solution
			l = mid+1;
			ans = mid;
		}
		}
		return ans;
	}

//	private static int sqrt(int n) {
//		int i=1;
//		while(i*i<=n) {                      // naive solution
//			i++;
//		}
//		return i-1;
//	}

}
