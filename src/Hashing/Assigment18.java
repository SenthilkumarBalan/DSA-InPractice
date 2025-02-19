package Hashing;

import java.util.*;

/**
	 *1) Did I understand the problem? -> If yes, go to next step !!
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
	 * 
	 * Pseudo code: Initiate 2 maps and add each string values in key and value pair combinations. Compare 2 maps and if 
	 * it same then return true or else false. because each map if it does not same key and value pair then it is not a 
	 * panagram
 */

public class Assigment18 {
	
	public static boolean findAnagram(String s1, String s2) {
		char[] charArray = s1.toCharArray();
		Map<Character, Integer> output = new HashMap<>();
		for(char c: charArray) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		char[] charArray1 = s2.toCharArray();
		Map<Character, Integer> output1 = new HashMap<>();
		for(char c1: charArray1) {
			output1.put(c1, output1.getOrDefault(c1, 0)+1);
		}
		if(output.equals(output1)) {
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		String s1="geeks"; String s2="kseeg";
		boolean anagram = findAnagram(s1, s2);
		System.out.println(anagram);
		String s3="allergy"; String s4="allergic";
		boolean anagram1 = findAnagram(s3, s4);
		System.out.println(anagram1);
		String s5="aacc"; String s6="ccac";
		boolean anagram2 = findAnagram(s5, s6);
		System.out.println(anagram2);
	}

}
