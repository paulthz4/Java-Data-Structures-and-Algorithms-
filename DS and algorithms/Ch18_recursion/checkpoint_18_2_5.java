package Ch18_recursion;

public class checkpoint_18_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exp(3,3));
	}
	public static int exp(int x, int n) {
		if(n == 1)
			return x;
		return x * exp(x, n-1);
	}
}
