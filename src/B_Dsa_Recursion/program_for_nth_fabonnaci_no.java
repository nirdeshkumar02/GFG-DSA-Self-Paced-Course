package B_Dsa_Recursion;

public class program_for_nth_fabonnaci_no {

	public static void main(String[] args) {
		
		int n = 9;
		System.out.println(fabonacci(n));

	}

	 static int fabonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return (fabonacci(n-1)+fabonacci(n-2));
	}

}
