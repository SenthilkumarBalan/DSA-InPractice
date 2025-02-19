package week4.day2;

public class MaxConsecutive {
	
	//Brute force
	public static int brutelongestOnes(int[] nums, int k) {
		int maxOnes=0;
		for(int i=0;i<nums.length;i++) {
			int zeros=0;
			for(int j=i;j<nums.length;j++) {
				if(nums[j]==0) {
					zeros++;
				}
				if(zeros<=k) {
					maxOnes=Math.max(maxOnes, j-i+1);
				}
				else
					break;
			}
		}
		
		return maxOnes;
	}
	
	public static int longestOnes(int[] nums, int k) {
		
		int left=0, maxOnes=0, zeros=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				zeros++; //count all the zero's in array. 4 0's available and store
			}
			while(zeros>k) {
				if(nums[left]==0) {
					zeros--;
				}
				left++;
			}
			maxOnes=Math.max(maxOnes, i-left+1);
		}
		
		
		return zeros;
	}
	
	public static void main(String[] args) {
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0}; int k=2;
		//int maxCons = longestOnes(nums, k);
		int brutelongestOnes = brutelongestOnes(nums, k);
		System.out.println(brutelongestOnes);
	}

}
