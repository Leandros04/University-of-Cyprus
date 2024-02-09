
public class CQueue {
	public int[] elems;
	private int capacity;
	private int size;
	private int head;

	public CQueue(int capacity) {
		this.capacity = capacity;
		this.elems = new int[capacity];
		this.size = 0;
		this.head = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size != 0;
	}

	public void enqueue(int c) {
		if (!isFull()) {
			elems[(head + size) % capacity] = c;
			size++;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int dequeue() {
		int val = -1;

		if (!isEmpty()) {
			val = elems[head];
			elems[head] = 0;
			size--;
			head = (head + 1) % capacity;
		}

		return val;
	}
	
	
}
