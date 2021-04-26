package K_Stack;
import java.util.*;
public class b_MyStack {
	ArrayList<Integer> al = new ArrayList<>();
	void push(int x) {
		al.add(x);
	}
	
	int pop() {
		int result = al.get(al.size()-1);
		al.remove(al.size()-1);
		return result;
	}
	
	int peek() {
		return al.get(al.size()-1);
	}
	
	int size() {
		return al.size();
	}
	
	boolean isEmpty() {
		return al.isEmpty();
	}
}
