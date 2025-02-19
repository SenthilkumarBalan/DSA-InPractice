package gPTProblems;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


import java.util.Arrays;

public class PairsumTwoPointers {
	
	public static int[] pairSum(int[] numbers, int target) {
		
		int left=0, right=numbers.length-1;
		while(left<right) {
			if(numbers[left]+numbers[right]==target) {
				return new int [] {left+1, right+1};
			}
			else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else
                left++;
				
		}
		return new int[] {}; 
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 6}; int target=6;
		int[] pairSum = pairSum(nums, target);
		System.out.println(Arrays.toString(pairSum));
		
		int[] nums1= {2,3,4}; int target1=6;
		int[] pairSum2 = pairSum(nums1,target1);
		System.out.println(Arrays.toString(pairSum2));
	}

}
