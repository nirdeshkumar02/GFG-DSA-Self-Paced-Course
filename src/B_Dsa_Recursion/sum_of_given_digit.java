package B_Dsa_Recursion;

public class sum_of_given_digit {

	public static void main(String[] args) {
		
		int x = 648;
		
		int sum_of_digit = sum_of_digit(x);
		System.out.println("The sum of digit "+x+" is = "+sum_of_digit);

	}

	  static int sum_of_digit(int x) {
		if(x==0) return 0;
		
		return (x % 10 + sum_of_digit(x/10));
	  }
}
	

