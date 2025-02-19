package assignments;
import java.util.*;
/**
 *  * 1) Did I understand the problem? -> If yes, go to next step !!
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
	 * Create an arrayList and initiate a loop and add initialization from array length-k and condition is till lenth
	 * of an array and increment it. Subtract array length - k to find remaining length. Start an another loop and
	 * initialization from 0th index of an array and condition is till remaining length and add it. 
	 * 
 */

public class Assignment21 {
	
	
	public static void rotate(int[] nums, int k) {
		if(nums==null && nums.length<=1) {
			return;
		}
		List<Integer> list = new ArrayList<>(); 
		for(int i=nums.length-k;i<nums.length;i++){
			list.add(nums[i]);
		}
		int remainLen=nums.length-k;
		for(int j=0;j<remainLen;j++) {
			list.add(nums[j]);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		rotate(nums, 3);
		int[] nums1 = {-1,-100,3,99};
		rotate(nums1, 2);
	}

}
