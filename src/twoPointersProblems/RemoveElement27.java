package twoPointersProblems;

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
	 * 
	 */
 	/**
 	 * Get both left and right pointer. left pointer to count the duplicate elements and right pointer to 
 	 * traverse through out the array. if nums[right] is not equal to val parameter then assign nums[right]
 	 * to nums[left] and increment the left. Finally return the left.
 	 */

public class RemoveElement27 {
	
	public static int removeElement(int[] nums, int val) {
		int left=0;
		for(int right=0;right<nums.length;right++) {
			if(nums[right]!=val) {
				nums[left]=nums[right];
                left++;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		int[] num= {3,2,2,3}; int val=3;
		int removeElement = removeElement(num, val);
		System.out.println(removeElement);
		int[] num1 = {0,1,2,2,3,0,4,2}; int val1=2;
		int removeElement2 = removeElement(num1, val1);
		System.out.println(removeElement2);
		
	}

}
