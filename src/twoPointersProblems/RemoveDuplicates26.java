package twoPointersProblems;

public class RemoveDuplicates26 {
	
	public static int removeDuplicates(int[] nums) {
		
		int left=0;
		for(int right=1;right<nums.length;right++) {
			if(nums[right]!=nums[left]) {
				left++;
				nums[left]=nums[right];
			}
		}
		return left+1;
	}
	
	public static void main(String[] args) {
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}

}
