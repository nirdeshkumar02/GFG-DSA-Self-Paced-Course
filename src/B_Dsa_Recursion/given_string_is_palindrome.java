package B_Dsa_Recursion;

public class given_string_is_palindrome {

	public static void main(String[] args) {
		
		String str = "NIRDESH";
		
		if(isPalindrome(str))
			System.out.println("True");
		else
			System.out.println("false");
}

	 static boolean isPalindrome(String str) {
		
		 int n = str.length();
		 if(n==0)
			 return true;
		return isPalindrome(str,0,n-1);
	}

	 static boolean isPalindrome(String str, int s, int e) {
		if(s==e)
			return true;
		if(str.charAt(s) != str.charAt(e))
			return false;
		if(s<e+1)
			return isPalindrome(str, s+1, e-1);
		return true;
	}
}
