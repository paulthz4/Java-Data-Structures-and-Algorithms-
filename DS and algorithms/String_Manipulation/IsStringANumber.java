package String_Manipulation;

public class IsStringANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is 1324 a number: "+isNumber("132s4"));
		System.out.println("is 1324 a number: "+isNumberRecursively("132s4"));
	}
	
	public static boolean isNumber(String s) {
		char[] chars = s.toCharArray();
		for(Character c: chars) {
			if(!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static boolean isNumberRecursively(String s) {
		// not finished
		if(s.length() == 1)
			return Character.isDigit(s.charAt(0));
		return isNumberRecursively(s.substring(1));
	}
}
