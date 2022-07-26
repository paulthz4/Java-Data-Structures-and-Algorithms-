package leetcode;

public class CapitalizeTitle {
//	You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. 
//  Capitalize the string by changing the capitalization of each word such that:
//
//		If the length of the word is 1 or 2 letters, change all letters to lowercase.
//		Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
//		Return the capitalized title
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitalizeTitle("The Dog wEnT To peE"));
	}
	
	public static String capitalizeTitle(String title) {
		String str = "";
		// split the string with " " (space)
		// iterate through array. Check length of each entry, change capital based off the length using a temp variable. Add the temp variable to str including " "
		String[] arr = title.split(" ");
		for(int i=0; i<arr.length; i++) {
			String temp = "";
			if(arr[i].length() <= 2) {
				str += arr[i].toLowerCase()+" ";
			}
			else {
				String ch = arr[i].substring(0,1).toUpperCase();
				str += ch + arr[i].substring(1).toLowerCase()+" ";
			}
		}
		return str.trim();
	}
	
	public static String capitalizeTitle2(String title) {
		String str = "";
		// split the string with " " (space)
		// iterate through array. Check length of each entry, change capital based off the length using a temp variable. Add the temp variable to str including " "
		String[] arr = title.split(" ");
		for(int i=0; i<arr.length; i++) {
			String temp = "";
			if(arr[i].length() <= 2) {
				str += arr[i].toLowerCase()+" ";
			}
			else {
				char ch = (char) (arr[i].charAt(0)+32);
				str += ch + arr[i].substring(1).toLowerCase()+" ";
			}
		}
		return str.trim();
	}
}
