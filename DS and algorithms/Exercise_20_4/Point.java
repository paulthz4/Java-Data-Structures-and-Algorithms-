package Exercise_20_4;

public class Point implements Comparable<Point> {
	private double x = 0;
	private double y = 0;

	public Point(double a, double b) {
		x = a;
		y = b;
	}

	public void setX(double a) {
		x = a;
	}

	public void setY(double a) {
		y = a;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return y;
	}

	@Override
	public int compareTo(Point point) {
		// TODO Auto-generated method stub
		if (x == point.getX()) {
			return 0;
		} else if (y > point.getY()) {
			return 1;
		} else if (y < point.getY())
			return -1;
		else
			return -1;
	}

}
