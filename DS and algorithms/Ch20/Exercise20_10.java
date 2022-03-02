package Ch20;

/**************************************************************************
* (Perform set operations on priority queues) Create two priority queues, *
* {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and              *
* {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their union, *
* difference, and intersection.                                           *
**************************************************************************/
import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

public class Exercise20_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue1 = new PriorityQueue<>(
				Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> queue2 = new PriorityQueue<>(
				Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		System.out.println("Queue1: " + queue1 + " \nQueue2: " + queue2);
		System.out.println("Union: " + union(queue1, queue2));
		System.out.println("Difference: " + difference(queue1, queue2));
		System.out.println("Intersection: " + intersection(queue1, queue2));

	}

	public static Collection<String> intersection(PriorityQueue<String> a, PriorityQueue<String> b) {
		PriorityQueue<String> intersection = new PriorityQueue<>();
		for (String name : a) {
			if (b.contains(name)) {
				intersection.offer(name);
			}
		}
		return intersection;
	}

	public static PriorityQueue<String> difference(PriorityQueue<String> a, PriorityQueue<String> b) {
		PriorityQueue<String> difference = new PriorityQueue<>();
		for (String name : b) {
			for (String name2 : a)
				if (!a.contains(name) && !b.contains(name2)) {
					if (!difference.contains(name) && !difference.contains(name2)) {
						difference.offer(name);
						difference.offer(name2);
					}
				}
		}
		return difference;//should include Michael but it doesn't
	}

	public static Collection<String> union(PriorityQueue<String> a, PriorityQueue<String> b) {
		PriorityQueue<String> union = new PriorityQueue<>();
		for (String name : a) {
			if (!union.contains(name)) {
				union.offer(name);
			}
		}
		for (String name : b) {
			if (!union.contains(name)) {
				union.offer(name);
			}
		}
		return union;
	}
}
