package Ch24;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyArrayListTest {
	MyArrayList<String> myList = new MyArrayList<>();
	ArrayList<String> list = new ArrayList<>();

	@Test
	void testAdd() {
		myList.add("First entry");
		list.add("First entry");
		assertEquals(myList.get(0), list.get(0));
	}
	
	@Test
	void testRemove() {
		for(int i=0; i<40; i++) {
			myList.add(""+i);
			list.add(""+i);
		}
		myList.remove(30);
		list.remove(30);
		assertEquals(myList.get(30), list.get(30));
	}
	
	@Test
	void testSet() {
		for(int i=0; i<40; i++) {
			myList.add(""+i);
			list.add(""+i);
		}
		myList.set(10, "index 10");
		list.set(10, "index 10");
		assertEquals(myList.get(10), list.get(10));
	}
	
	@Test
	void testToString() {
		for(int i=0; i<40; i++) {
			myList.add(""+i);
			list.add(""+i);
		}
		myList.set(10, "index 10");
		list.set(10, "index 10");
		System.out.println(myList.toString()+"\n"+ list.toString());
		assertEquals(myList.toString(), list.toString());
		
	}
}
