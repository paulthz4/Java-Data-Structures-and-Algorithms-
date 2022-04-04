package Ch18_recursion;

public class Exercise_18_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upperCount("Hi tHere", 0));
	}
	
	public static int upperCount(String s, int count) {
		if(s.isEmpty())
			return count;
		if(Character.isUpperCase(s.charAt(0)))
			count++;
		return upperCount(s.substring(1), count);
	}
}
