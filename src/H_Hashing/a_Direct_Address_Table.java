package H_Hashing;

public class a_Direct_Address_Table {
	 int[] table=new int[1000];

	public static void main(String[] args) {
		
		a_Direct_Address_Table dat = new a_Direct_Address_Table();
		
		dat.insert(10);
		dat.insert(20);
		dat.insert(30);
		
		System.out.println(dat.search(20));
		System.out.println(dat.search(25));
		dat.delete(10);
		System.out.println(dat.search(10));
	}

	private void delete(int i) {
		table[i] =0;
	}

	private int search(int i) {
		return table[i];
	}

	private void insert(int i) {
		table[i] =1;
	}

}
