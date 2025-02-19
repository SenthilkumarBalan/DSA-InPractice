package slidingWindow;
import java.util.*;

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
	 * 
	 * Pseudo code: 
	 * Create left and maxCount variable and HashMap. Create a for loop and iterate over the array using right variable
	 * Add into map like if the key is already present then value should be increased+1 and use getOrDefault method
	 * to achieve this. Initiate a while loop and get output size and if it is greater than 2 then decrement the 
	 * the value of key and increment left. if nums[left] is zero then remove nums[left].
	 * 
 */

public class Assignment27 {
	
	public static int totalFruit(int[] nums) {
		int left=0, maxCount=0;
		Map<Integer, Integer> output = new HashMap<>();
		for(int right=0;right<nums.length;right++) {
			output.put(nums[right], output.getOrDefault(nums[right], 0)+1);
			while(output.size()>2) {
				output.put(nums[left], output.getOrDefault(nums[left], 0)-1);
				if(output.get(nums[left])==0){
					output.remove(nums[left]);
				}
				left++;
			}
			maxCount=Math.max(maxCount, right-left+1);
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int totalFruit = totalFruit(arr);
		System.out.println(totalFruit);
		int[] arr1 = {0,1,2,2};
		int totalFruit1 = totalFruit(arr1);
		System.out.println(totalFruit1);
		int[] arr2 = {1,2,3,2,2};
		int totalFruit2 = totalFruit(arr2);
		System.out.println(totalFruit2);
		
	}

}
