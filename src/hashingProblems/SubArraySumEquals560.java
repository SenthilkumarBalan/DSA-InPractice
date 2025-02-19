package hashingProblems;
import java.util.*;

/**
 * ) Did I understand the problem? -> If yes, go to next step !!
 * 
 * What is the input(s) type? 
 * What is the expected output? 
 * Do I have constraints to solve the problem? 
 * Do I have all informations to go to next step!! 
// * How big is your test data set will be?
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
	 * Create an hashMap with both key and value as Integer generic
	 * Initiate variables prefixSum and count variables as 0.
	 * Initially put 0 as key and 1 as value this will make sure that any subarray starting from the begining of 
	 * the array and summing up to k should be calculated correctly. For Example 3 is here and k value is also 3 then
	 * we need to add that as a substring.
	 * Add array elements as prefixSum using prefix sum technique and put it into map with it is value. if key is
	 * already present then increment 1 using getorDefault value method.
	 * if map contains prefixSum-k then get the value of prefixSum-k and add it in to counter. 
	 * Finally return the counter.
	 * 
	 */
public class SubArraySumEquals560 {
	
	public static int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> output = new HashMap<>();
		int prefixSum=0;
		int count=0;
		output.put(0,1);
		for(int num: nums) {
			prefixSum+=num;
			if(output.containsKey(prefixSum-k)) {
				count=count+output.get(prefixSum-k);
			}
			output.put(prefixSum, output.getOrDefault(output, 0)+1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1}; int k=2;
		int subarraySum = subarraySum(nums, k);
		System.out.println(subarraySum);
		
		int[] nums1 = {1,2,3}; int k1=3;
		int subarraySum1 = subarraySum(nums1, k1);
		System.out.println(subarraySum1);
		
		int[] nums2 = {}; int k2=3;
		int subarraySum2 = subarraySum(nums2, k2);
		System.out.println(subarraySum2);
		
		int[] nums3 = {-1,-4,8}; int k3=3;
		int subarraySum3 = subarraySum(nums3, k3);
		System.out.println(subarraySum3);
	}

}
