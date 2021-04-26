package C_Dsa_Arrays;

public class Arrays_Insertion {

	public static void main(String[] args) {
	
     int arr[]= {10,20,30,50,60};
     
     int pos = 3;
     int element = 100;
     for(int i = arr.length-1; i>pos-1 ; i--) {    //simple array naive program.this program runs if element is inserted on position
    	 arr[i] = arr[i-1];                        // if element is inserted at position  then (pos-1) -> index_pos.
     }
     arr[pos-1]=element;
     for(int i =0; i<arr.length;i++) {
    	 System.out.println(arr[i]+" ");
     }
	}

}
