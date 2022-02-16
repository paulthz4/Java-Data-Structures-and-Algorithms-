package Ch20;

import java.util.PriorityQueue;

public class Exercise20_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{
		@Override
		public MyPriorityQueue<E> clone() throws CloneNotSupportedException{
			MyPriorityQueue<E> temp  = new MyPriorityQueue<>();
			temp.addAll((MyPriorityQueue<E>) super.clone());
			return temp ;
		}
	}
}
