package assignments;

public class Assignment03 {

	/**
	 * *  1) Did I understand the problem? -> If yes, go to next step !!
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
	 * Split the string based on space given.
	 * Iterate over the array elements using loop and pass each element inside the string builder constructor
	 * and use reverse inbuilt method to reverse it. Finally combines reversed string element into a single string using join string 
	 * method and return it. 
	 * 
	 */
	
	public static String reverseString(String s) {
		String[] reverseString = s.split(" ");
		
		for(int i=reverseString.length-1;i>0;i--) {
			reverseString[i] = new StringBuilder(reverseString[i]).reverse().toString();
		}
		
		String result = String.join(" ", reverseString);
		return result;
	}
	
	public static String reverseStringManual(String s) {
		String[] reverseString1 = s.split(" ");
		for(int i=0;i<reverseString1.length;i++) {
			reverseString1[i] = manualString(reverseString1[i]);
		}
		String result1 = String.join(" ", reverseString1);
		return result1;
	}
	
	public static String manualString(String word) {
		char[] chars = word.toCharArray();
		int start=0, end=word.length()-1;
		while(start<end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		String s = "Welcome To Testleaf";
		String reverseString = reverseString(s);
		System.out.println(reverseString);
		String s1 = "";
		String reverseString2 = reverseString(s1);
		System.out.println(reverseString2);
		String s2 = "987 654 321";
		String reverseString3 = reverseString(s2);
		System.out.println(reverseString3);
		String s3 ="revesestring";
		String reverseString4 = reverseString(s3);
		System.out.println(reverseString4);
		
		String s5 = "Welcome To Testleaf";
		String reverseString5 = reverseStringManual(s5);
		System.out.println(reverseString5);
		String s6 = "";
		String reverseString6 = reverseStringManual(s6);
		System.out.println(reverseString6);
		String s7 = "987 654 321";
		String reverseString7 = reverseStringManual(s7);
		System.out.println(reverseString7);
		String s8 = "revesestring";
		String reverseString8 = reverseStringManual(s8);
		System.out.println(reverseString8);
		
		
		
	}
}
