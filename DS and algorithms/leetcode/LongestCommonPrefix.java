package leetcode;

public class LongestCommonPrefix {
//	Write a function to find the longest common prefix string amongst an array of strings.
//	If there is no common prefix, return an empty string "".
//	Input: strs = ["flower","flow","flight"]
//  Output: "fl"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"flower","flow", "flight"};
		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		for (int i = 0; i < strs[0].length(); i++) 
        {
            char tmpChar = strs[0].charAt(i); 
            for (int j = 0; j < strs.length; j++) 
            {
                if (strs[j].length() == i || strs[j].charAt(i) != tmpChar) 
                {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]; 
	}

}
