package H_Hashing;

import java.util.*;

public class b_Implement_of_chain {
	int Bucket;
	ArrayList<LinkedList<Integer>>table;
	b_Implement_of_chain(int b) {
		Bucket = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i =0; i<b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	 void insert(Integer k) {
		int i = k % Bucket;
		table.get(i).add(k);
		
	}
	 boolean search(Integer k) {
		int i = k % Bucket;
		return table.get(i).contains(k);
	}
	 void delete(Integer k) {
		int i = k % Bucket;
		table.get(i).remove(k);
	}
}
 class GFG{
	public static void main(String[] args) {
		b_Implement_of_chain Ic = new b_Implement_of_chain(7);
		Ic.insert(10);
		Ic.insert(20);
		Ic.insert(15);
		Ic.insert(7);
		System.out.println(Ic.search(10));
		Ic.delete(15);
		System.out.println(Ic.search(15));
	}
}
