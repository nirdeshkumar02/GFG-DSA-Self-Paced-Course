package D_Dsa_Bit_Magic;

public class powerset_of_a_given_set {

	public static void main(String[] args) {
		String s = "abc";
		powerSet(s);

	}

	public static void powerSet(String s) {
		int n = s.length();
		int powSize = (int)Math.pow(2, n);
		for(int i = 0; i<powSize; i++) {
			for(int j = 0; j<n; j++) {
				if((i & (1<<j))!=0)
					System.out.println(s.charAt(j));
			}
			
		}
		System.out.println();
	}

}
