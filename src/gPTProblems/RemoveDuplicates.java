package gPTProblems;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] nums) {
		int left=0;
		for(int right=1;right<nums.length;right++) {
			if(nums[left]!=nums[right]) {
				left++;
				nums[left]=nums[right];
			}
		}
		
		return left+1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 3};
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}

}
