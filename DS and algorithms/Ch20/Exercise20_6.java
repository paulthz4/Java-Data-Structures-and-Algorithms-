package Ch20;

/*********************************************************************************
* (Use iterators on linked lists) Write a test program that stores 5 million     *
* integers in a linked list and test the time to traverse the list using an      *
* iterator vs. using the get(index) method.                                      *
*********************************************************************************/
import java.util.*;

public class Exercise20_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			list.add((int)( Math.random() * 50));
		}
		Iterator<Integer> iterator = list.iterator();
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		long time2 = System.currentTimeMillis();
		System.out.println("Start time using get(index) " + time1 + " end time is " + System.currentTimeMillis());
		System.out.println("Difference is "+(time2-time1));
		long time3 = System.currentTimeMillis();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		long time4 = System.currentTimeMillis();
		System.out.println("Start time using iterator " + time2 + " end time is " + System.currentTimeMillis());
		System.out.println("Difference is "+(time4-time3));
		//using the iterator is faster
	}

}
