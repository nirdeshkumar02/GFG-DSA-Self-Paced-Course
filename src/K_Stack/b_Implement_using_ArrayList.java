package K_Stack;

public class b_Implement_using_ArrayList {

	public static void main(String[] args) {
		b_MyStack al = new b_MyStack();
		al.push(10);
		al.push(5);
		al.push(13);
		al.push(15);
		System.out.println(al.peek());
		System.out.println(al.pop());
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}

}
