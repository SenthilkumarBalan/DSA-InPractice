package binarySearch;
import java.util.*;

/**
 *  Did I understand the problem? -> If yes, go to next step !!
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
	 * Pseudo code:
	 * Initiate a HashMap and put String s values and increment 1 for all the character
	 * put string t values and if the character already exist then decrement 1
	 * finally get the values of map and which is less than zero then return that character
 */

public class Assignment38 {
	
	public static char findTheDifference(String s, String t) {
		Map<Character, Integer> output = new HashMap<>();
		for(char c: s.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		
		for(char c: t.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)-1);
			if(output.get(c)<0) {
				return c;
			}
		}
		
		return ' '; 
	}
	
	public static void main(String[] args) {
		String s = "abcd", t = "abcde";
		char theDifference = findTheDifference(s,t);
		System.out.println(theDifference);
		
		String s1="", t1="y";
		char theDifference2 = findTheDifference(s1,t1);
		System.out.println(theDifference2);
	}

}
