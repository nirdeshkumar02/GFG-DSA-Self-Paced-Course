package C_Dsa_Arrays;
import java.util.*;
public class Arrays_Searching {
	public static void main(String[] arg) {
     Scanner scn =  new Scanner(System.in);
		int age[] = {10, 20, 30, 40, 50};
		System.out.println("Enter the value of no. which u wanna find = ");
		int x = scn.nextInt();
		int n = age.length;
		scn.close();
		 System.out.println("The given no. "+x+" is present at index = ");
		  System.out.println(searching(age, x, n));
}

	static int searching(int age[], int x, int n) {
	for(int i = 0; i < n; i++) {
		if(age[i]==x) return i;
		
	}
	return -1;
		
	}
}

// this is a linear searching that takes O(n) time complexity.