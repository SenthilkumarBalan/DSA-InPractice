package DataStrcures;

import java.util.Arrays;

public class DiffPairArray532 {
	
	/**
	 * 
	 * Get an array in input and value to be compare
	 * Sort the array and Initialize variable as i in 0th index and j as 1st and initialize counter
	 * Initialize while loop and that loops run until i is less the array count as well as j
	 * if nums[j]-nums[i] are equal to 'k' then increase i and j and counter
	 * if nums[j]-nums[i] is greater than 'k' increment i++ and add if condition 
	 * when nums[j]-nums[i]=0 then increment j++
	 * if nums[j]-nums[i] is less than k then increment j
	 * finally return the count variable  
	*/
	
	public static int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0; int j=1; int count =0;
		while(i<nums.length && j<nums.length) {
			if(nums[j]-nums[i]==k) {
				count++;
				i++;
				j++;
//				while(j<nums.length && nums[j]==nums[j-1]) {
//					j++;
//				}
			}
			else if(nums[j]-nums[i]>k) {
				i++;
//				if(i-j==0) {
//					j++;
//				}
			}
			else {
				j++;
			}
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; int k=1;
		int pairs = findPairs(arr, k);
		System.out.println(pairs);
	}

}
