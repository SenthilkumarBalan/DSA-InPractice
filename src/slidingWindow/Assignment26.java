package slidingWindow;

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
	 * 
	 * Pseudo code:Initiate left, Zerocount and mexLength as zero. Iterate the array and find maxLength using
	 * Math function and store it in maxLength variable. If nums[right] is zero then increment zeroCount variable.
	 * If zeroCount is greater than 1 then shrink the window and increment the left variable and decrease zerCount.
 */

public class Assignment26 {
	
	public static int longestSubarray(int[] nums) {
		int left=0, zeroCount=0, maxLength=0;
		for(int right=0;right<nums.length;right++) {
			if(nums[right]==0) {
				zeroCount++;
			}
			while(zeroCount>1) {
				if(nums[left]==0) {
					zeroCount--;
				}
				left++;
			}
			maxLength=Math.max(maxLength, right-left);
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,0,1};
		int longestSubarray = longestSubarray(arr);
		System.out.println(longestSubarray);
		int[] arr1 = {0,1,1,1,0,1,1,0,1};
		int longestSubarray1 = longestSubarray(arr1);
		System.out.println(longestSubarray1);
		int[] arr2 = {1,1,1,0};
		int longestSubarray2 = longestSubarray(arr2);
		System.out.println(longestSubarray2);
		
	}

}
