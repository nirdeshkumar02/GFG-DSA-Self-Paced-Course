package K_Stack;

public class a_Implement_using_Array {

	public static void main(String[] args) {
		a_myStack s = new a_myStack(5);
		s.push(10);
		s.push(5);
		s.push(13);
		s.push(15);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
