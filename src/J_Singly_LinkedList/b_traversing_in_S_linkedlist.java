package J_Singly_LinkedList;

public class b_traversing_in_S_linkedlist {

	public static void main(String[] args) {
		SNode head = new SNode(10);
		head.next = new SNode(20);
		head.next.next= new SNode(30);
		head.next.next.next= new SNode(40);
		printList(head);
	}

	private static void printList(SNode head) {
		SNode curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
	}

}
