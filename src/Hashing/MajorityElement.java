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
	 * Pseudo code
	 * Find totalSum and keep aside. initiate leftSum as 0 and iterate over an array and find right sum
	 * using this formula rightSum=totalSum-leftSum=array[i].
	 * if leftSum is equal to rightSum then return the index, or else find totalSum again as leftSum
	 * 
	 * Pseudo code
	 * Create a map with integer generic. Put keys and it relevant pairs in map. 
	 * Find threshold of length (if a number is greater than half of it length then obviously it will be the majority ele)
	 * Find keySet and iterate over the array and if key value is greater than the threshold then retun the value.
	 * Or else return -1
 */

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> output = new HashMap<>();
		for(int num: nums) {
			output.put(num, output.getOrDefault(num, 0)+1);
		}
		int max=nums.length/2;
		for(int key: output.keySet()) {
			if(output.get(key)>max) {
				return key;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,3};
		int majorityElement = majorityElement(arr);
		System.out.println(majorityElement);
		int[] arr1 = {2,2,1,1,1,2,2};
		int majorityElement1 = majorityElement(arr1);
		System.out.println(majorityElement1);
		int[] arr2 = {1,1,1};
		int majorityElement2 = majorityElement(arr2);
		System.out.println(majorityElement2);
		
	}

}
