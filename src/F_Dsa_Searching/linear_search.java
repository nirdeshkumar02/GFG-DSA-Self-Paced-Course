package F_Dsa_Searching;

public class linear_search {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,82,69};
		int x = 82;
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Found at position("+i+")");
			}
		}
		
		

	}

}
