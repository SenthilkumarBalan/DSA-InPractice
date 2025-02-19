package assignments;

public class SlidingWindow {
	
	public static int maxSumArray(int[] nums, int k) {
		int maxSum=0, currSum=0;
		for(int i=0;i<k;i++) {
			currSum+=nums[i];
		}
		maxSum=Math.max(maxSum, currSum);
		
		for(int i=k;i<nums.length;i++) {
			currSum-=nums[i-k];
			currSum+=nums[i];
		}
		maxSum=Math.max(maxSum, currSum);
		return maxSum;	
	}
	public static void main(String[] args) {
		int[] nums= {100,200,300,400}; int k=2;
		int maxSumArray = maxSumArray(nums,k);
		System.out.println(maxSumArray);
	}
}
