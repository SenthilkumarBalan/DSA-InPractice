package week3.day2;
import java.util.*;

/**
 * Get an array and k int variable as method parameter and initiate Map data structure.
 * Calculate running prefix sum using enhanced for loop and find running pre-fix sum
 * Add array elements in map as key value pair and use getordefault method to assign value of particular key 
 * as zero if it is presenting first time and add +1 if it already present.
 * Logically if we subtract prefixsum with K then we can find whether this sub array already exist or not.
 * So if prefixSum-K is already present then get it value add that value in count variable meanwhile count 
 * variable in zero initially. 
 */
public class SubarraysumK {
	
	public static int subarraySum(int[] nums,int k) {
		HashMap<Integer, Integer> output = new HashMap<>();
		output.put(0, 1);
		int prefixSum = 0;
		int count = 0;
		for(int num: nums) {
			prefixSum+=num;
			if(output.containsKey(prefixSum-k)) {
				count+=output.get(prefixSum-k);
			}
			output.put(prefixSum, output.getOrDefault(prefixSum, 0)+1);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,1};int k=2;
		int[] arr1 = {1,2,3}; int k1=3;
		int subarraySum = subarraySum(arr, k);
		int subarraySum2 = subarraySum(arr1, k1);
		System.out.println(subarraySum);
		System.out.println(subarraySum2);
		
	}

}
