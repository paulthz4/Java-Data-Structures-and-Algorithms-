package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
		// not relevant
		String[] a = new String[10];
		a[1] = "second";
		a[2] = "third";
		a[5] = "sixth";
		System.out.println(Arrays.toString(a));
	}

	public static boolean isPalindrome(String s) {
		if(s.equals(" "))
			return true;
		String temp = s.toLowerCase();
		char[] ar = temp.toCharArray();
		
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0; i<ar.length;i++) {
			if(ar[i] >= 97 && ar[i] <= 122 && ar[i] != ' ' || (ar[i] > 47 && ar[i] < 58)) {
				list.add(ar[i]);
			}
		}
		
		System.out.println(list);
		
        for(int i=0,j=list.size()-1; i<j; i++,j--){
            if(list.get(i) != list.get(j)){
                return false;
            }
        }
        return true;
	}
}
