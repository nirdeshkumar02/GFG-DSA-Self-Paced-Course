package D_Dsa_Bit_Magic;

public class Count_set_bit_by_LookUp_Table {

	public static void main(String[] args) {
		
		initialize();
		int n = 7;
		System.out.println(countSetBit(n));
	}
	
	static int[] table = new int[256];
	
	public static void initialize() {
		table[0] = 0;
		for(int i =0; i< 256; i++)
		{
			table[i] = (i & 1) + table[i/2];
		}
		
	}

	public static int countSetBit(int n) {
		
		return (table[n & 0xff] + table[(n >> 8) & 0xff] + table[(n >> 16) & 0xff] + table[n >> 24]);
	}
	  
	 
	

}
