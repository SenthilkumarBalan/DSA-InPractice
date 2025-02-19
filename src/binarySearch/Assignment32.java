package binarySearch;

import java.util.Arrays;
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
	 * Pseudo code: 
	 * Initiate Results array with {-1,-1} which is used to use return the output this problem
	 * Initiate low as 0 and high as array.length-1 and it acts as two pointers.
	 * Initiate a while loop and it will be executing until high pointer is greater or equal to low pointer.
	 * Initiate mid pointer which is addition of low and high pointers and divide by 2 and it's core think of 
	 * the binary search. The mid pointer will varied each loop iteration and which achieves the o(log n) time.
	 * If mid of array is greater than equal to target then high pointer will be mid-1 else low=mid+1 
	 * which ultimately compromises the logirthm complexity. if nums[mid] is equal to target then assign
	 * mid pointer to results[0] index. Reset the low and high pointers and initiate again same kind of while loop.
	 * Find mid pointer again and nums[mid] is less than or equal to target then change low pointer to mid+1 or
	 * else mid=low+1. if nums[mid] is equals to target then assign mid pointer to results[0] index. Finally return 
	 * results.
	 * 
 */

public class Assignment32 {
	
	public static int[] findFirstandLast(int[] nums, int target) {
		int[] results = {-1,-1};
		int low=0, high=nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>=target) {
				high=mid-1;
			}
			else
				low=mid+1;
			if(nums[mid]==target) {
				results[0]=mid;
			}
		}
		low=0; high=nums.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]<=target) {
				low=mid+1;
			}
			else
				high=mid-1;
			if(nums[mid]==target) {
				results[1]=mid;
			}
		}
		return results;
	}
	public static void main(String[] args) {
		
		int[] arr = {5,7,7,8,8,10}; int target=8;
		int[] firstandLast = findFirstandLast(arr, target);
		System.out.println(Arrays.toString(firstandLast));
		int[] arr1 = {5,7,7,8,8,10}; int target1=6;
		int[] firstandLast1 = findFirstandLast(arr1,target1);
		System.out.println(Arrays.toString(firstandLast1));
	}

}
