package Ch18_recursion;

public class Exercise_18_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 5234;
		System.out.println("sum of 234 is "+sumDigits(a));
	}

	public static long sumDigits(long n) {
		if(n / 10 < 1)
			return n;
		return (n % 10) + sumDigits(n / 10);
	}
}
