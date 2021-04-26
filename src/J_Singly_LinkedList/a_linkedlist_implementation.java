package J_Singly_LinkedList;

public class a_linkedlist_implementation {

	public static void main(String[] args) {
		SNode head = new SNode(10);
		SNode temp1 = new SNode(20);
		SNode temp2 = new SNode(30);
		head.next = temp1;
		temp1.next = temp2;
		System.out.println(head.data +"-->"+temp1.data+"-->"+temp2.data);
		
	}

}
