package slidingWindow;

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
	 * Pseudo code: Initialize left pointer to 0 Initialize right pointer to 0 Initialize k to the maximum number of 0s that can be flipped 
	 * For each element in the array (iterate with right pointer): 
	 * If the element at right pointer is 0: Decrement k (use one flip) 
	 * While k is less than 0 (too many flips used): If the element at left pointer is 0:
	 *  Increment k (undo one flip) Move the left pointer to the right (shrink the window) 
	 *  Return the size of the window (right pointer - left pointer)
 */

public class Assignment22 {
	
	public static int longestOne(int[] nums, int k) {

		int left = 0,  right;
		for (right = 0; right < nums.length; right++) { 
			if (nums[right] == 0) k--; 
			if (k < 0) { 
				if (nums[left] == 0) k++;
				left++; 
				}
			} 
		return right - left;
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,0,1,1,1,1,0}; int k=2;
		int longestOne = longestOne(arr, k);
		System.out.println(longestOne);
		int[] arr1= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; int k1=3;
		int longestOne2 = longestOne(arr1, k1);
		System.out.println(longestOne2);
		
	}

}
