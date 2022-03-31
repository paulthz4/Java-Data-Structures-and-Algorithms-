package Ch18_recursion;

public class Exercise_18_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseDisplay(12345);
		
	}
	public static void reverseDisplay(int n){
		if(n / 10 == 0)
			System.out.print(n %10);
		else {
			System.out.print(n % 10);
			reverseDisplay(n / 10);
		}
	}
}
