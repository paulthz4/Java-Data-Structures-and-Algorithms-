package leetcode;

import java.util.ArrayList;

public class Equivalent_Strings {
	// write a function that takes a String array. The strings contain key inputs from the keyboard. It may have the -B that means 
	// backspace and erases the previous key. Compare the two strings, see if they are equal after considering the backspaces
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] a = {"a,b,c,d", "a,b,c,-B,c,d} ... function returns true;
		// String[] a = {"a,b,c,d", "a,b,c,-B,d} ... function return false
		String[] a = {"a,b,c,d", "a,b,c,-B,d"};
		System.out.println(checkString(a));
	}

	public static boolean checkString(String[] arr) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		String[] s1 = arr[0].split(",");
		String[] s2 = arr[1].split(",");

		for (int i = 0; i < s1.length; i++) {
			if(s1[i].equals("-B"))
				list1.remove(list1.size()-1);
			else
				list1.add(s1[i]);
		}

		for (int i = 0; i < s2.length; i++) {
			if(s2[i].equals("-B"))
				list2.remove(list2.size()-1);
			else 
				list2.add(s2[i]);
		}
		return list1.equals(list2);
	}
}
