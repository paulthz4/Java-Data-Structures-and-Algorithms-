package Ch24;

public class MyQueue<E> {
	private java.util.LinkedList<E> list = new java.util.LinkedList<>();
	
	public MyQueue() {}
	
	public void enqueue(E e) {
		list.add(e);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return "Queue"+list.toString();
	}
}
