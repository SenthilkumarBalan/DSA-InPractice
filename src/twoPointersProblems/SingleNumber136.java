package twoPointersProblems;

import java.util.Arrays;

public class SingleNumber136 {
	
	public static int singleno(int[] nums) {
//		 Arrays.sort(nums); 
//		    int left = 0;
//		    while (left < nums.length-1) {
//		        if (nums[left] == nums[left + 1]) {
//		            left += 2; 
//		        } 
//		        else {
//		        	return nums[left];
//		        }
//		    }
//		    return nums[left];
		int results=0;
		for(int num: nums) {
			results^=num;
		}
		return results;
		
	}
	
	public static void main(String[] args) {
		int[] nums= {4,1,1,2,2};
		int singleno = singleno(nums);
		System.out.println(singleno);
	}

}
