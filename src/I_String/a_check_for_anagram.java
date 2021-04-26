package I_String;

public class a_check_for_anagram {
	static final int CHAR = 256;
	public static void main(String[] args) {
		 String str1 = "abaac"; 
	        String str2 = "aacba";  
	        
	        if(areAnagram(str1, str2)) {
	        	System.out.println("These string are anagram");
	        }
	        else {
	        	System.out.println("These are not anagram");
	        }

	}

	private static boolean areAnagram(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		
		int count[] = new int[CHAR];
		for(int i =0; i<str1.length();i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		for(int i=0; i<CHAR; i++) {
			if(count[i] != 0) return false;
		}
		return true;
	}

//	private static boolean areAnagram(String str1, String str2) {
//		if(str1.length()!= str2.length())
//			return false;
//		
//		char a1[] = str1.toCharArray();
//		Arrays.sort(a1);                                     naive solution
//		str1 = new String(a1);
//		
//		char a2[] = str2.toCharArray();
//		Arrays.sort(a2);
//		str2 = new String(a2);
//		
//		return str1.equals(str2);
//	}

}
