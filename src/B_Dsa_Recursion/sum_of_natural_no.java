package B_Dsa_Recursion;

public class sum_of_natural_no {

	public static void main(String[] args) {
		
		int n = 50;
		System.out.println(naturalnoSum(n));

	}

	 static int naturalnoSum(int n) {
		if(n==0)
			return 0;
		return (n+naturalnoSum(n-1));
	}
}
