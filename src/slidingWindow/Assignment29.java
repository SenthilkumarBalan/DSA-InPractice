package slidingWindow;

import java.util.*;

/**
 * Did I understand the problem? -> If yes, go to next step !!
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
	 * Pseudo code: Initiate int, maxLen and HashMap to manipulate the string. Iterate the string and using keySet
	 * verify the map does contain 'a', 'b' and 'c' if contain then subtract length of the string with right pointer
	 * and add it in maxLen variable. Shrink the window to next character by using left pointer and increment left.
	 * Finally return maxLen; 
 */

public class Assignment29 {
	
	public static int numberOfSubstrings(String s) {
		int left = 0, maxLen = 0;
	    Map<Character, Integer> output = new HashMap<>();
	    for (int right = 0; right < s.length(); right++) {
	        output.put(s.charAt(right), output.getOrDefault(s.charAt(right), 0) + 1);
	        while (output.keySet().containsAll(Arrays.asList('a', 'b', 'c'))) {
	            maxLen += s.length() - right; 
	            output.put(s.charAt(left), output.get(s.charAt(left)) - 1);
	            if (output.get(s.charAt(left)) == 0) {
	                output.remove(s.charAt(left));
	            }
	            left++;
	        }
	    }
	    return maxLen;
	}
	
	public static void main(String[] args) {
		String s="abcabc";
		int numberOfSubstrings = numberOfSubstrings(s);
		System.out.println(numberOfSubstrings);
		
		String s1="aaacb";
		int numberOfSubstrings2 = numberOfSubstrings(s1);
		System.out.println(numberOfSubstrings2);
		
		String s2="abc";
		int numberOfSubstrings3 = numberOfSubstrings(s2);
		System.out.println(numberOfSubstrings3);
	}

}
