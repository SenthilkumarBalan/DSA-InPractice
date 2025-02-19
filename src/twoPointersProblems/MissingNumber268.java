package twoPointersProblems;

public class MissingNumber268 {
	
	public static int missingNumber(int[] nums) {
		
		int n=nums.length;
		int i=0;
		while(i<n) {
			if(nums[i]<n && nums[i]!=nums[nums[i]]) {
				int temp= nums[i];
				nums[i] =nums[temp];
				nums[temp]=temp;
			}
			else
				i++;
		}
		
		for( i=0;i<n;i++) {
			if(nums[i]!=i) {
				return i;
			}
		}
		return n;
		
//		int n = nums.length;
//		int expectedSum = n*(n+1)/2;
//		int actualSum = 0;
//		
//		for(int num: nums) {
//			actualSum+=num;
//		}
//		return expectedSum-actualSum;
		
		
	}
	
	public static void main(String[] args) {
		int[] nums= {0,1};
		int missingNumber = missingNumber(nums);
		System.out.println(missingNumber);
	}
}
