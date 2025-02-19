package assessment;

import java.util.Arrays;

	/**
	 * create low and high variables and assign it 0 and nums.length-1
	 * initiate first while loop and loop should run until low is less than or equal to high
	 * Initiate and find the mid value at inside the loop and if target is less than or equal to mid 
	 * then reset high value to mid-1 else reset low value is mid+1. once nums[mid] is equal to target then
	 * assign that mid value into [0] of nums array.
	 * 
	 * initiate 2nd while loop and loop should run until low is less than or equal to high
	 * Initiate and find the mid value at inside the loop and if target is greater than or equal to mid
	 * then reset low value to mid+1 else high value to mid-1. once nums[mid] is equal to target then  
	 * assign that mid value into [1] of nums array.
	 */

public class Problem3 {
	
	public static int[] sortingArray(int[] nums , int target) {
		int[] results = {-1,-1};
		if(nums.length==0) {
			return results;
		}
		int low=0, high = nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>=target){
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
		int[] nums= {5,7,7,8,8,10}; int target = 8;
		int[] sortingArray = sortingArray(nums,target);
		System.out.println(Arrays.toString(sortingArray));
		int[] nums1= {5,7,7,8,8,10}; int target1 = 1;
		int[] sortingArray2 = sortingArray(nums1, target1);
		System.out.println(Arrays.toString(sortingArray2));
		int[] nums2= {}; int target2 = 0;
		int[] sortingArray3 = sortingArray(nums2, target2);
		System.out.println(Arrays.toString(sortingArray3));
	}
	
	

}
