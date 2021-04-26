package B_Dsa_Recursion;

public class check_an_element_in_Array_is_present {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,8,10,11};
		int n = arr.length;
		int x = 11; int l=0; int r=n-1;
		boolean elementPresent = elementPresent(arr, x, l, r);
            System.out.println("The given element is present= "+elementPresent);
	}

	 static boolean elementPresent(int[] arr, int x, int l, int r) {
		if(r<l) return false;
		if(arr[l]==x) return true;
		if(arr[r]==x) return true;
		return elementPresent(arr, x, l+1, r-1);
	}

}
