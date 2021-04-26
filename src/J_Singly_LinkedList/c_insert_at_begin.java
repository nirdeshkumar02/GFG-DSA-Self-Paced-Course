package J_Singly_LinkedList;

public class c_insert_at_begin {

	public static void main(String[] args) {
		SNode head = null;
		head = insertBegin(head,10);
		head = insertBegin(head,20);
		head = insertBegin(head,30);
		head = insertBegin(head,40);
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

	private static SNode insertBegin(SNode head, int x) {
		SNode temp = new SNode(x);
		temp.next = head;
		return temp;
	}

}
