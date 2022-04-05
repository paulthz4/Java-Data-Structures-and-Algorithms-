package Ch24;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;

	public MyLinkedList() {
	}

	public MyLinkedList(Node e) {
		head = e;
	}

	public MyLinkedList(E[] elements) {
		for (E element : elements) {
			add(element);
		}
	}

	@Override
	public int size() {
		return size;
	}

	public E getFirst() {
		if (size == 0)
			return null;
		else
			return head.element;
	}

	public E getLast() {
		if (size == 0)
			return null;
		else
			return tail.element;
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e);
		newNode.next = head;
		head = newNode;
		size++;
		if (tail == null)
			tail = head;
	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		if (tail == null)
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public E removeFirst() {
		if (size == 0)
			return null;
		else {
			Node<E> temp = head;
			head = head.next;
			size--;
			if (head == null)
				return null; // if list becomes empty
			return temp.element;
		}
	}

	public E removeLast() {
		if (size == 0)
			return null;
		else if (size == 1) {
			Node<E> temp = head;
			head = tail = null;
			size--;
			return head.element;
		} else {
			Node<E> current = head;
			for (int i = 1; i < size - 1; i++) {
				current = current.next;
			}
			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;

		}
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == size - 1) {
			return removeLast();
		} else {
			Node<E> previous = head;

			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}

			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public java.util.Iterator<E> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements java.util.Iterator<E> {
		private Node<E> current = head; // Current index

		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}

		@Override
		public void remove() {
			// Left as an exercise
		}
	}

	private static class Node<E> {
		E element;
		Node<E> next;

		public Node(E element) {
			this.element = element;
		}
	}

	@Override
	public void clear() {
		size = 0;
		head = tail = null;
	}

	@Override
	public void add(int index, E e) {
		if (index == 0) {
			addFirst(e);
		} else if (index >= size) {
			addLast(e);
		} else {
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<>(e);
			(current.next).next = temp;
			size++;
		}
	}

	@Override
	public E get(int index) {
		return head.element;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object set(int index, Object e) {
		// TODO Auto-generated method stub
		return null;
	}
}
