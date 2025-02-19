package Hashing;
/**
 * /*
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
	 * 
	 * Pseudo code
	 * Find totalSum and keep aside. initiate leftSum as 0 and iterate over an array and find right sum
	 * using this formula rightSum=totalSum-leftSum=array[i].
	 * if leftSum is equal to rightSum then return the index, or else find totalSum again as leftSum
	 * 
	 * Pseudo code: Convert string into character array. Create a HashSet and add each character into that set.
	 * As set nature is it does not add any duplicates, so if the string contains any duplicates and then
	 * it won't add into set and finally if set size is == 26 as panagram nature then it returns true or else false.
 */

import java.util.*;

public class Panagram {
	
	public static boolean isPanagram(String sentence) {
		char[] charArray = sentence.toCharArray();
		Set<Character> output = new HashSet<>();
		for(Character num: charArray) {
			output.add(num);
		}
		
		if(output.size()==26) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s="thequickbrownfoxjumpsoverthelazydog";
		boolean panagram = isPanagram(s);
		System.out.println(panagram);
		String s1="leetcode";
		boolean panagram2 = isPanagram(s1);
		System.out.println(panagram2);
		String s2="abcdefghijklmnopqrstuvwxyz";
		boolean panagram3 = isPanagram(s2);
		System.out.println(panagram3);
		String s3 ="aaaaaaaaaaaaaaaaaaaaaaaaaa";
		boolean panagram4 = isPanagram(s3);
		System.out.println(panagram4);
	}

}
