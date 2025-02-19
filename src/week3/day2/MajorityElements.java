package week3.day2;
import java.util.*;

/**
 * Initiate a method and get an array as input
 * Initiate a hashmap and put array elements in key and value pair (Key is array and it's count is value)
 * Use getOrDefault method to increment key's value it already present else map assigns value as zero
 * Get the half size of array and stores it in a variable
 * Use keySet to get the key's and iterate each and compare with maximum array size variable.
 * If condition matches then return key
 */

public class MajorityElements {
	

public static int majorityElements(int[] nums) {
		Map<Integer, Integer> output = new HashMap<>();
		for(int num: nums) {
			output.put(num, output.getOrDefault(num, 0)+1);
		}
		int arrayMax = nums.length/2;
		for(int key: output.keySet()) {
			if(output.get(key)>arrayMax) {
				return key;
			}
		}
		
		return -1;
}

//bruteforce
public static int brutemajorityElements(int[] nums) {
	int count =0;
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]==nums[j]) {
				count++;
			}
		}
		int arrayMaximum = nums.length/2;
		if(count>arrayMaximum) {
			return nums[i];
		}
	}
	return -1;
}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int majorityElements = majorityElements(nums);
		int brutemajorityElements = brutemajorityElements(nums);
		System.out.println(majorityElements);
		System.out.println(brutemajorityElements);
		
	}

}
