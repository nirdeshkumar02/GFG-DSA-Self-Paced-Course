package B_Dsa_Recursion;

public class check_palindrome_no {

	public static void main(String[] args) {
		
		int x = 129;
		int temp = rev(x,0);
		if(temp==x) {
			System.out.println("The given no. is palindrome");
		}
		else {
			System.out.println("The given no. is not palindrome");
		}

	}

	 static int rev(int x, int temp) {
		if(x==0) return temp;
		temp = (temp*10)+(x%10);
		return rev(x/10,temp);
	}

}
