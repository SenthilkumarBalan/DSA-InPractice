package Hashing;
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
	 * Pseudo code: Initiate a map and convert string into characters. Then put into map and iterate each character in
	 * a loop using EntrySet and append the keys and values in a stringbuilder.
 */


public class Assignment19 {
	
	public static char[] appendInteger(String s1) {
		Map<Character, Integer> output = new HashMap<>();
		char[] charArray = s1.toCharArray();
		for(char c: charArray) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		StringBuilder result = new StringBuilder();
		for(Map.Entry<Character, Integer> entry:output.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
		}
		return result.toString().toCharArray();	
	}
	
	public static void main(String[] args) {
		String s ="aabbccddde";
		char[] appendInteger = appendInteger(s);
		System.out.println(appendInteger);
		String s1="a";
		char[] appendInteger2 = appendInteger(s1);
		System.out.println(appendInteger2);
		
	}

}
