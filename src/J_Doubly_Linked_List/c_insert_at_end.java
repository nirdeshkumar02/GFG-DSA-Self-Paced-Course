package J_Doubly_Linked_List;

public class c_insert_at_end {

	public static void main(String[] args) {
		Dnode head = new Dnode(10);
		Dnode temp1 = new Dnode(20);
		Dnode temp2 = new Dnode(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head = insertEnd(head,40);
		printlist(head);

	}

	private static void printlist(Dnode head) {
		Dnode curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();	
	}

	private static Dnode insertEnd(Dnode head, int i) {
		Dnode temp = new Dnode(i);
		if(head == null) return temp;
		Dnode curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}

}
