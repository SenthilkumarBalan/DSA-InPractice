package twoPointersProblems;

import java.util.Arrays;

public class Assignment12 {
	
	/**
	 * ) Did I understand the problem? -> If yes, go to next step !!
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
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */
	
	/**
	 * Pseudo code
	 * Sort the array and initiate 3 variables called left, right and maxSum.
	 * Left pointer should be initial position of the array and right pointer should be last position of array
	 * Initially maxSum should be -1. Iterate through the array and break the loop once right is less than left.
	 * add nums[left] and nums[right] and store it in sum variable. 
	 * if Sum is less than k then find maximum between and sum and maxSum and store it in maxSum and increase the left.
	 * or else decrease the right and return the maxSum
	 * 
	 */
	
	public static int maxNumber(int[] nums, int k) {
		int left=0, right=nums.length-1;
		Arrays.sort(nums);
		int maxSum=-1;
		while(left<right) {
			int sum=nums[left]+nums[right];
			if(sum<k) {
				maxSum=Math.max(maxSum, sum);
				left++;
				
			}
			else
				right--;
		}
			return maxSum;
			
	}
	public static void main(String[] args) {
		int[] nums= {34,23,1,24,75,33,54,8}; 
		int k = 60;
		int maxNumber = maxNumber(nums, k);
		System.out.println(maxNumber);
		
		int[] nums1= {33,54,7}; 
		int k1 = 62;
		int maxNumber1 = maxNumber(nums1, k1);
		System.out.println(maxNumber1);
		
		int[] nums2= {74,70}; 
		int k2 = 10;
		int maxNumber2 = maxNumber(nums2, k2);
		System.out.println(maxNumber2);
		
		int[] nums3= {-74,70,8,2}; 
		int k3 = 10;
		int maxNumber3 = maxNumber(nums3, k3);
		System.out.println(maxNumber3);
	}
}
