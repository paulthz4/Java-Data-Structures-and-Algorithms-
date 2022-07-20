package leetcode;

public class Prime_Time {
	// write  a function that determine if the paramter is a prime number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(21));
	}
	
	public static boolean isPrime(int num) {
		int i=2;
		while(i<num) {
			if(num % i == 0)
				return false;
			i++;
		}
		return true;
	}

}
