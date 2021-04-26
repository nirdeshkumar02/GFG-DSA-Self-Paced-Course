package C_Dsa_Arrays_problems;
import java.util.*;
public class reverse_an_array {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the value of n = ");
	int n = scn.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the value in array = ");
	for(int i = 0; i< n ; i++)
	{
		arr[i] = scn.nextInt();
	}
	System.out.println("The reverse array is = ");
	reverseArray(arr , n);
	scn.close();
	
	}
	

	static void reverseArray(int[] arr , int n) 
	{  int low = 0;
	   int high = n-1;
	   while(low<high)
	   {
		   int temp = arr[high];
		   arr[high] = arr[low];
		   arr[low] = temp;
		   low++;
		   high++;
		   
	   }
	  

}
}
