package J_Doubly_Linked_List;

public class b_insert_at_begin {

	public static void main(String[] args) {
		Dnode head = new Dnode(10);
		Dnode temp1 = new Dnode(20);
		Dnode temp2 = new Dnode(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		head = insertBegin(head,5);
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

	private static Dnode insertBegin(Dnode head, int x) {
		Dnode temp = new Dnode(x);
		temp.next = head;
		if(head != null)
			head.prev = temp;
		return temp;
	}

}
