package Exercise_20_4;

import java.util.Arrays;

/**********************************************************************************
 * (Sort points in a plane) Write a program that meets the following
 * requirements: * *
 * ■ Define a class named Point with two data fields x and y
 * to represent a * point’s x- and y-coordinates. Implement the Comparable
 * interface for * comparing the points on x-coordinates. If two points have the
 * same * x-coordinates, compare their y-coordinates. * *
 * ■ Define a class named
 * CompareY that implements Comparator<Point>. Implement * the compare method to
 * compare two points on their y-coordinates. If two * points have the same
 * y-coordinates, compare their x-coordinates. * *
 * ■ Randomly create 100 points
 * and apply the Arrays.sort method to display the * points in increasing order
 * of their x-coordinates and in increasing order of * their y-coordinates,
 * respectively. *
 **********************************************************************************/
public class Exercise20_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] x = new double[100];
		double[] y = new double[100];
		for (int i = 0; i < 100; i++) {
			Point a = new Point(Math.random() * 100, Math.random() * 100);
			x[i] = a.getX();
			y[i] = a.getY();
		}
		Arrays.sort(x);
		System.out.println("\nList of x's\n");
		for (double e : x)
			System.out.println(e);
		Arrays.sort(y);
		System.out.println("\nList of y's\n");
		for (double e : y)
			System.out.println(e);
	}

}
