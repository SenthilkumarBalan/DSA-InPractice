package week3.day2;
import java.util.*;

/**
 * Get array as an method input and initiate Map data structure
 * Initiate a variable prefix sum which used for calculate prefix running sum of given array.
 * Initiate enhance array for loop and iterate over an array and add array value with sum variable
 * to find running pre-fix sum. 
 * Add key and it is value in map and check a condition if key is already present then return true or else false. 
 * The logic is if key is present again then obviously there is a zero in sub-array.
 */

public class SubarraysumZero {
	
	public static boolean findSubArraySumnonBrute(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int sum=nums[i];
			if(sum==0) {
				return true;
			}
		for(int j=i+1;j<nums.length;j++) {
			sum+=nums[j];
			if(sum==0) {
				return true;
				}
			}
		}
		return false;
	}
	
	public static boolean findSubArraySum(int[] nums) {
		
		Map<Integer, Integer> output = new HashMap<>();
		 int prefixSum=0;
		for(int num: nums) {
			prefixSum+=num;
			if(output.containsKey(prefixSum)) {
				return true;
			}
			output.put(prefixSum, 1);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums= {4, 2, -3, 1, 6};
		int[] nums1= {4, 2, 0, 1, 6};
		int[] nums2= {-3, 2, 3, 1, 6};
//		boolean subArraySum = findSubArraySum(nums);
//		boolean subArraySum2 = findSubArraySum(nums1);
//		boolean subArraySum3 = findSubArraySum(nums2);
//		System.out.println(subArraySum);
//		System.out.println(subArraySum2);
//		System.out.println(subArraySum3);
		boolean subArraySumnonBrute = findSubArraySumnonBrute(nums);
		boolean subArraySumnonBrute2 = findSubArraySumnonBrute(nums1);
		boolean subArraySumnonBrute3 = findSubArraySumnonBrute(nums2);
		System.out.println(subArraySumnonBrute);
		System.out.println(subArraySumnonBrute2);
		System.out.println(subArraySumnonBrute3);
	}

}
