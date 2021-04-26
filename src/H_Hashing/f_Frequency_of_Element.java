package H_Hashing;
import java.util.*;
public class f_Frequency_of_Element {

	public static void main(String[] args) {
		int arr[] = {15,16,27,27,28,15};
		int n = arr.length;
		System.out.println("Frequency with element = ");
		freqElement(arr,n);

	}

	private static void freqElement(int[] arr, int n) {
		 Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
	        for(int i = 0; i < n; i++)
	        {
	            int key = arr[i];
	            if(hmp.containsKey(arr[i]) == true)
	              hmp.put(arr[i], hmp.get(arr[i]) + 1);
	            else
	              hmp.put(arr[i], 1);    
	        }
	    
	       for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
	        System.out.println(itr.getKey() + " " + itr.getValue());
	    }
		
	}

//	private static void freqElement(int[] arr, int n) {
//		for(int i =0; i<n; i++) {
//			boolean flag = false;
//			for(int j =0; j<i; j++) 
//				if(arr[i] == arr[j]) {
//					flag = true;
//					break;
//				}
//			if(flag==true)                 // naive solution having time complexity of O(n)
//				continue;
//			int freq = 1;
//			for(int j = i+1; j<n; j++) 
//				if(arr[i] == arr[j])
//					freq++;
//			System.out.println(arr[i]+" "+freq);
//			
//		}
//		
//	}


