package week4.day2;

public class MaxSubArray {
	
	//Brute force
	public static int maxSubArray(int[] nums, int k) {
		 int outPut = Integer.MIN_VALUE; 
		for(int i=0;i<=nums.length-k;i++) {
			int maxValue=0;// it is declared inside outer loop because we have to calculate sum of each sub array.
			for(int j=i;j<i+k;j++) {
				maxValue+=nums[j];
			}
			outPut=Math.max(outPut, maxValue);
		}
			return outPut;
	}

	
	//sliding window
	public static int slidewindowmaxSubArray(int[] nums, int k) {
		int curSum=0; int maxSum=0;
		for(int i=0;i<k;i++) {
			curSum+=nums[i];
		}
		maxSum=curSum;
		//maxSum = Math.max(maxSum, curSum);
		for(int i=k;i<nums.length;i++) {
			curSum-=nums[i-k];
			curSum+=nums[i];
			maxSum=Math.max(maxSum, curSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = {100,200,300,400}; int k=2;
		//int maxSubArray = maxSubArray(arr, k);
		int slidewindowmaxSubArray = slidewindowmaxSubArray(arr, k);
		System.out.println(slidewindowmaxSubArray);
	}
	
}
