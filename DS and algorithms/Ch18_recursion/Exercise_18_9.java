package Ch18_recursion;

public class Exercise_18_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseDisplay("abcd");
		String s = "ab";
		System.out.println("\n"+s.substring(0,s.length()));
	}

	public static void reverseDisplay(String s) {
		if(s.length() == 1) 
			System.out.print(s);
		else {
			System.out.print(s.charAt(s.length()-1));
			reverseDisplay(s.substring(0,s.length()-1));
		}
	}
}
