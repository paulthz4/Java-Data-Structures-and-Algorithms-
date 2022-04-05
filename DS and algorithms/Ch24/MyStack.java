package Ch24;

public class MyStack<E>{
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	
	public void push(E e) {
		list.add(e);
	}
	
	public E peek() {
		return list.get(size()-1);
	}
	
	public E pop() {
		return list.remove(size()-1);
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public String toString() {
		return "Stack "+list.toString();
	}
}
