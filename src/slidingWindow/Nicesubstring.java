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
	 * 
	 * Pseudo code: if the length of the string is less than 2, return an empty string. Create a set to store 
	 * unique characters. Populate the set with characters from the string. Iterate through each character in the string.
	 * Check if both lowercase and uppercase versions of the character are in the set.
	 * Recursively find the longest nice substring for the left and right parts of the string.
	 * Return the longer of the two substrings. If no characters break the condition, return the original string
	 *  
	 * 
 */

public class Nicesubstring {
	
	public static String longestNiceSubstring(String s) {
		if(s.length() < 2){
            return "";
        }
        Set<Character> set = new HashSet<>();
        for(Character c: s.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))){
                continue;
            }
            String prev=longestNiceSubstring(s.substring(0,i));
            String post =longestNiceSubstring(s.substring(i+1));
            return (prev.length() >= post.length()) ? prev:post;
            
        }
        return s;
	}
	
	public static void main(String[] args) {
		String s="aabbCc";
		String longestNiceSubstring = longestNiceSubstring(s);
		System.out.println(longestNiceSubstring);
		String s1="dDdzAAa";
		String longestNiceSubstring2 = longestNiceSubstring(s1);
		System.out.println(longestNiceSubstring2);
		String s2="c";
		String longestNiceSubstring3 = longestNiceSubstring(s2);
		System.out.println(longestNiceSubstring3);
	}

}
