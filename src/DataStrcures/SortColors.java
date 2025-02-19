package DataStrcures;

import java.util.Arrays;

	/**
	 * Initiate an array as parameter of a method.
	 * Initiate 4 variables which are right, left, mid and temp.
	 * Assign 0 as left, right as Second last value of an array, mid and temp as 0 respectively.
	 * Initiate a while loop and if right is greater than or equal to mid then checking a condition if array
	 * of mid is equal to zero then swap between mid and left.
	 * else if mid of array is equal to one then increment mid
	 * else swap between mid and right 
	 */

public class SortColors {
	
	public static void sorttheColors(int[] nums) {
		
		int left=0; int right = nums.length-1; int mid=0; int temp=0;
		while(mid<=right) {
			if(nums[mid]==0) {
				temp=nums[mid];
				nums[mid]=nums[left];
				nums[left]=temp;
				left++;
				mid++;
			}
			else if(nums[mid]==1) {
				mid++;
			}
			else {
				temp=nums[mid];
				nums[mid]=nums[right];
				nums[right]=temp;
				temp=nums[mid];
				
				right--;
		}
		
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		System.out.println(Arrays.toString(arr));
		
	}

}