package J_Doubly_Linked_List;

public class e_delete_tail_DLL {

	public static void main(String[] args) {
		Dnode head = new Dnode(10);
		Dnode temp1 = new Dnode(20);
		Dnode temp2 = new Dnode(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		printlist(head);
		head = deltail(head);
		printlist(head);
	}

	private static Dnode deltail(Dnode head) {
		if(head == null) return null;
		if(head.next == null) return null;
		Dnode curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		return head;
	}

	private static void printlist(Dnode head) {
		Dnode curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
		
	}

}
