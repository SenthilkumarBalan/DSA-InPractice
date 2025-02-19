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
	 * 
	 * Pseudo code: 
	 * Create 2 list which are positive and negative. Iterate list over the array and add positive numbers into
	 * positive list and negative into negative list. Initiate a while loop and initiate variables i and j as 0.
	 * If positive list size is greater than i then add postive value into result and same if negetive list size 
	 * is greater than j then add into result. 
	 * 
 */

public class Assignment20 {
	
	public static ArrayList<Integer> alternatePostiveNo(ArrayList<Integer> arr){
		List<Integer> positive = new ArrayList<>();
		List<Integer> negetive = new ArrayList<>();
		for(int num: arr) {
			if(num>=0) {
				positive.add(num);
			}
			else
				negetive.add(num);
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		int i=0, j=0;
		while(i<positive.size()) {
			if(i<positive.size()) {
				result.add(positive.get(i++));
			}
			if(j<negetive.size()) {
				result.add(negetive.get(j++));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
		ArrayList<Integer> alternatePostiveNo = alternatePostiveNo(arr);
		System.out.println(alternatePostiveNo);
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
		ArrayList<Integer> alternatePostiveNo2 = alternatePostiveNo(arr1);
		System.out.println(alternatePostiveNo2);
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(9, 5, -2, -1, 5, 0, -5, -3, 2));
		ArrayList<Integer> alternatePostiveNo3 = alternatePostiveNo(arr2);
		System.out.println(alternatePostiveNo3);
	}

}
