package L_Queue;
import java.util.*;
class Queue{
	int front, rear, size, cap, arr[];
	public Queue(int cap){
		this.cap = cap;
		front = this.size = 0;
		rear = cap-1;
		arr = new int[this.cap];
	}
	
	boolean isFull(Queue queue) {
		return (queue.size == queue.cap);
	}
	
	boolean isEmpty(Queue queue) {
		return (queue.size == 0);
	}
	
	void enqueue(int item) {
		if(isFull(this))
			return;
		this.rear = (this.rear + 1) % this.cap;
		this.arr[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item+" enqueued to Queue");
	}
}


