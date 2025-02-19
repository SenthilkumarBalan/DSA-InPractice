package Hashing;
import java.util.*;

/*
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
	 * Pseudo code: Create 2 sets which are set 1 and set 2 and add string 1 and string 2 in the set1 and set2 respectively.
	 * Create another set which are called uncommon and add set1 into set2 that will give unique values. Create another set
	 * which is called common and retain set1 from set2. Now removeall the uncommon values from common. 
 */

public class Assignment17 {
	
	public static char[] findUncommon(String s1, String s2) {
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for(char c: s1.toCharArray()) {
			set1.add(c);
		}
		for(char c1: s2.toCharArray()) {
			set2.add(c1);
		}
		HashSet<Character> uncommon = new HashSet<>(set1);
		uncommon.addAll(set2);
		HashSet<Character> common = new HashSet<>(set1);
		common.retainAll(set2);
		uncommon.removeAll(common);
		
		StringBuilder result = new StringBuilder();
		for(char c2: uncommon) {
			result.append(c2);
		}
		char[] charArray = result.toString().toCharArray();
		Arrays.sort(charArray);
		return charArray;
		
		
	}
	
	
	public static void main(String[] args) {
		String s1 = "characters"; String s2="alphabets";
		char[] uncommon = findUncommon(s1, s2);
		System.out.println(uncommon);
		String s3 = "geeksforgeeks"; String s4="geeksquiz";
		char[] uncommon2 = findUncommon(s3, s4);
		System.out.println(uncommon2);
		
	}

}
