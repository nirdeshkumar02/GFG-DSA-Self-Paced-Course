package J_Singly_LinkedList;

public class e_delete_first_node {

	public static void main(String[] args) {
		SNode head = new SNode(10);
		head.next = new SNode(20);
		head.next.next = new SNode(30);
		printList(head);
		head = delhead(head);
		printList(head);
	}

	private static SNode delhead(SNode head) {
		if(head == null) return null;
		return head.next;
	}

	private static void printList(SNode head) {
		SNode curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
	}

}
