package slidingWindow;
import java.util.*;

/**
 * 1) Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s) type? 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, Edge, Negative
	 * Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? 
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code // Bruteforce
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * Pseudo code: Create 3 variables which are left, right and maxval. Initiate a map to store in key and value pair
	 * combo. Initiate a while loop and run until right pointer is less than the length of string. add each characters
	 * into map with relevant value and increment right pointer. Add another while loop and code will go inside
	 * if map key is any of it greater than 1. Inside that second loop remove that duplicate value. Now subtract right-left 
	 * and return as maxVal.
	 *  
 */

public class Assignment23 {
	
	public static int lengthOfLongestSubstring(String s) {
		int right=0,  left=0, maxLen=0;
		HashMap<Character, Integer> output = new HashMap<>();
		while(right<s.length()) {
			output.put(s.charAt(right), output.getOrDefault(s.charAt(right), 0)+1);
			while(output.get(s.charAt(right))>1) {
				output.put(s.charAt(left), output.getOrDefault(s.charAt(left), 0)-1);
				left++;
			}
			maxLen=Math.max(maxLen, right-left+1);
			right++;
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		String s="abcabcbb";
		int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
		System.out.println(lengthOfLongestSubstring);
		String s1="bbbbb";
		int lengthOfLongestSubstring1 = lengthOfLongestSubstring(s1);
		System.out.println(lengthOfLongestSubstring1);
		String s2="pwwkew";
		int lengthOfLongestSubstring2 = lengthOfLongestSubstring(s2);
		System.out.println(lengthOfLongestSubstring2);
	}

}
