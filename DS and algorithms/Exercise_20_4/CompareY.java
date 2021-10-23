package Exercise_20_4;

import java.util.Comparator;

/*Define a class named CompareY that implements Comparator<Point>. Implement    *
*   the compare method to compare two points on their y-coordinates. If two       *
* 	 points have the same y-coordinates, compare their x-coordinates.  */
public class CompareY implements Comparator<Point> {
	public CompareY() {}

	@Override
	public int compare(Point o1, Point o2) {
		// TODO Auto-generated method stub
		if (o1.getY() == o2.getY()) {
			if (o1.getX() > o2.getX())
				return 1;
			else if (o1.getX() < o2.getX())
				return -1;
			else if (o1.getX() == o2.getX())
				return 0;
		} else if (o1.getY() < o2.getY())
			return -1;
		return 1;
	}

}
