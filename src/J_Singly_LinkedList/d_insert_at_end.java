package J_Singly_LinkedList;

public class d_insert_at_end {

	public static void main(String[] args) {
		SNode head = null;
		head = insertEnd(head,10);
		head = insertEnd(head,20);
		head = insertEnd(head,30);
		head = insertEnd(head,40);
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

	private static SNode insertEnd(SNode head, int x) {
		SNode temp = new SNode(x);
		if(head==null) return temp;
		SNode curr = head;
		while(curr.next != null) {
			curr= curr.next;
		}
		curr.next = temp;
		return head;
	}

}
