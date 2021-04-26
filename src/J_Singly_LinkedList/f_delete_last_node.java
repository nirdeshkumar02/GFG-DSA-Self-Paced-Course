package J_Singly_LinkedList;

public class f_delete_last_node {

	public static void main(String[] args) {
		SNode head = new SNode(10);
		head.next = new SNode(20);
		head.next.next = new SNode(30);
		printList(head);
		head = deltail(head);
		printList(head);

	}

	private static SNode deltail(SNode head) {
		SNode curr = head;
		if(curr == null) return null;
		if(curr.next == null) return null;
		while(curr.next.next != null) {
			 curr = curr.next;
		}
		curr.next = null;
		return head;
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
