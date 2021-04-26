package F_Dsa_Searching;

public class RepeatElement {

	public static void main(String[] args) {
		  RepeatElement repeat = new RepeatElement(); 
	        int arr[] = {3,3,5,6,5}; 
	        int arr_size = arr.length; 
	        repeat.printRepeating(arr, arr_size); 
	}
	void printRepeating(int arr[], int size) 
    { 
        int i;   
        System.out.println("The repeating elements are : "); 
     
        for(i = 0; i < size; i++) 
        { 
            if(arr[Math.abs(arr[i])] > 0) 
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    }  
}
