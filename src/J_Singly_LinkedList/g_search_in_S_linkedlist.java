package J_Singly_LinkedList;

public class g_search_in_S_linkedlist {

	public static void main(String[] args) {
		SNode head = new SNode(10);
		head.next = new SNode(20);
		head.next.next = new SNode(30);
		System.out.println("Position of element in Linked List"+" "+search(head,20));

	}

	private static int search(SNode head, int x) {
		int pos = 1;
		SNode curr = head;
		while(curr != null) {
			if(curr.data == x)
				return pos;
			else {
				pos++;
				curr = curr.next;
			}
		}
		return -1;
	}
}
