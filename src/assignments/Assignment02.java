package assignments;
import java.util.*;
/**
 *  1) Did I understand the problem? -> If yes, go to next step !!
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
 */
	/**
	 * Defines a string containing all vowels.
	 * Creates a list to store all the vowels found in the input string.
	 * Converts the string s into a character array using toCharArray() and iterates through each character c.
	 * Checks if the current character c is a vowel by using indexOf(c), 
	 * If c is found in the vowels string, it returns the index. Otherwise, it returns -1.
	 * If c is a vowel, it is added to the vowelList.
	 * Creates StringBuilder to construct the output string.
	 * Initializes vowelIndex to point to the last vowel in the vowelList.
	 *  This helps us replace vowels in reverse order.
	 *  Iterates through each character in the input string s. Checks if the character c is a vowel.
	 *  If c is a vowel, appends the vowel at vowelIndex (from the end of the list) to the result.
	 *  Decrements vowelIndex to point to the previous vowel in the list.
	 *  If c is not a vowel, appends it directly to the result.
	 *  Converts the StringBuilder object back to a string and returns it as the output
	 */

public class Assignment02 {
	
	public static String swapVowels(String s) {
		String vowels = "aeiouAEIOU";
		List<Character> vowelsLsit = new ArrayList<>();
		for(char c: s.toCharArray()) {
			if(vowels.indexOf(c)!=-1) {
				vowelsLsit.add(c);
			}
		}
		StringBuilder result = new StringBuilder();
		int vowelIndex=vowelsLsit.size()-1;
		for(char c: s.toCharArray()) {
			if(vowels.indexOf(c)!=-1) {
				result.append(vowelsLsit.get(vowelIndex--));
			}
			else
				result.append(c);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String s="Hello Everyone! Welcome to Testleaf";
		String swapVowels = swapVowels(s);
		System.out.println(swapVowels);
	}

}
