package Ch24;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
	static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	private int size = 0;

	public MyArrayList() {
	}

	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}

	public void add(int index, E e) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("index: " + index + ", Size: " + size);

		ensureCapacity();

		for (int i = size-1; i >= index; i++) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size+=1;
	}

	private void ensureCapacity() {
		if (size >= data.length) {
			E[] newData = (E[]) (new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	@Override
	public boolean contains(Object e) {
		for (int i = 0; i < data.length; i++) {
			if (e.equals(data[i]))
				return true;
		}
		return false;
	}

	@Override
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}

	private void checkIndex(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException("index: " + index + ", Size: " + size);
	}

	@Override
	public int size() {
		return size;
	}

	public void trimToSize() {
		if (size != data.length) {
			E[] newData = (E[]) (new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		} // If size == capacity, no need to trim
	}

	@Override /** Override iterator() defined in Iterable */
	public java.util.Iterator<E> iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator implements java.util.Iterator<E> {
		private int current = 0; // Current index

		@Override
		public boolean hasNext() {
			return current < size;
		}

		@Override
		public E next() {
			return data[current++];
		}

		@Override // Remove the element returned by the last next()
		public void remove() {
			if (current == 0) // next() has not been called yet
				throw new IllegalStateException();
			MyArrayList.this.remove(--current);
		}
	}

	@Override
	public void clear() {
		data = (E[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@Override
	public int indexOf(Object e) {
		for (int i = 0; i < data.length; i++) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		for (int i = size - 1; i >= 0; i--) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		checkIndex(index);
		E e = data[index];
		for (int i = index; i < size-1; i++) {
			data[i] = data[i + 1];
		}
		data[size - 1] = null;
		size--;
		return e;
	}

	@Override
	public E set(int index, E e) {
		checkIndex(index);
		E old = data[index];
		data[index] = e;
		return old;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			result.append(data[i]);
			if (i < size - 1)
				result.append(", ");
		}
		return result.toString() + "]";
	}

	public static void main(String args[]) {
		MyArrayList<String> a = new MyArrayList<>();
		a.add("ehool");
		System.out.println(a.get(0));
	}
}
