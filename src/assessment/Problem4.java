package assessment;
import java.util.*;

/**
  	 1) Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s) type? 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? 
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
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
 * Pseudo code:
 * 	Initiate an empty arrayList to store the start indices of anagram. 
 * 	If either string s or p is null then return list variable at that moment it will return empty list.
 * 	Create 2 arrays which are pCount and windowCount. pCount is used to tracks the frequency of each character in
 * 	string p and windowCount tracks the frequency of characters in the current window of input string s. 
 * 	Fills the pCount array with the frequency of each character in p input string.
 * 	Stores the length of the input string p as windowSize which determines the size of the window that will slide
 *	over the string s.
 *	Iterates through each character of s and update the windowCount array.
 *	Maintain the size of the window to match windowSize.
 *	Compares the frequency arrays pCount and windowCount.
 */

public class Problem4 {
		public static List<Integer> anagram(String s, String p) {
			List<Integer> result = new ArrayList<>();
			if(s==null || p==null || s.length()<p.length()) {
				return result;
			}
			
			int[] pCount = new int[26];
			int[] windowCount = new int[26];
			
			for(char c: p.toCharArray()) {
				pCount[c-'a']++;
			}
			
			int windowSize = p.length();
			for(int i=0;i<s.length();i++) {
				windowCount[s.charAt(i)-'a']++;
				
				if(i>=windowSize) {
					windowCount[s.charAt(i-windowSize)-'a']--;
				}
				
				if(Arrays.equals(pCount, windowCount)) {
					result.add(i-windowSize+1);
				}
			}
			
			return result;
			
		}
		public static void main(String[] args) {
			String s="cbaebabacd" , p="abc";
			List<Integer> anagram = anagram(s,p);
			System.out.println(anagram);
			String s1="abab" , p1="ab";
			List<Integer> anagram1 = anagram(s1,p1);
			System.out.println(anagram1);
			String s2="" , p2="ab";
			List<Integer> anagram2 = anagram(s2,p2);
			System.out.println(anagram2);
			String s3="" , p3="ab";
			List<Integer> anagram3 = anagram(s3,p3);
			System.out.println(anagram3);
			
		}
		
}
