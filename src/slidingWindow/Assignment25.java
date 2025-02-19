package slidingWindow;
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
	 * Pseudo code: Initiate sum and count variable and HashMap. Find running sum using for loop and add it into
	 * sum variable and put all the key's it into map and assign value using getOrDefault method. 
	 * If Map's key contains sum-goal then get that and add it into count variable. Finally return the count variable.
 */

public class Assignment25 {
	
	public static int numSubarraysWithSum(int[] nums, int goal) {
		int sum=0, count=0;
		HashMap<Integer, Integer> sumCount = new HashMap<>();
		sumCount.put(0, 1);
		for(int num: nums) {
			sum+=num;
			if(sumCount.containsKey(sum-goal)){
				count+=sumCount.get(sum-goal);
			}
			sumCount.put(sum, sumCount.getOrDefault(sum, 0)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1}; int k=2;
		int numSubarraysWithSum = numSubarraysWithSum(arr, k);
		System.out.println(numSubarraysWithSum);
		int[] arr1 = {0,0,0,0,0}; int k1=0;
		int numSubarraysWithSum1 = numSubarraysWithSum(arr1, k1);
		System.out.println(numSubarraysWithSum1);
	}
}
