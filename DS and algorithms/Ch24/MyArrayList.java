package Ch24;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
	static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	private int size = 0;
	
	public MyArrayList() {	
	}
	
	public MyArrayList(E[] objects) {
		for(int i=0; i<objects.length; i++) {
			add(objects[i]);
		}
	}
	
	@Override
	public void add(int index, E e) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("index: "+index+", Size: "+size);
		
		ensureCapacity();
		
		for(int i=index; i<size;i++) {
			data[i+1] = data[i];
		}
		data[index] = e;
		size++;
	}
	
	public void ensureCapacity() {
		if(size >= data.length) {
			E[] newData = (E[])(new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		return null;
	}

}
