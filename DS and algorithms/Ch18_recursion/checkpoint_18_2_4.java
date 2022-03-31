package Ch18_recursion;

public class checkpoint_18_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a recursive method for computing 2^n for a positive integer
		System.out.println(exp(3));
	}
	public static int exp(int n) {
		if(n == 1)
			return 2;
		return 2 * exp(n-1);
	}
}
