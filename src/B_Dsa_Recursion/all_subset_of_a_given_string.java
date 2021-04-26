package B_Dsa_Recursion;

public class all_subset_of_a_given_string {

	public static void main(String[] args) {
		
		String str = "ABC";
		int index = 0;
		String curr = "";
		powerSet(str,index,curr);
		
	}

	 static void powerSet(String str, int index, String curr) {
		int n = str.length();
		if(index == n) {
			System.out.println(curr);
		return;
		}
	 powerSet(str, index+1, curr+str.charAt(index));
	 powerSet(str, index+1, curr);

}
}
