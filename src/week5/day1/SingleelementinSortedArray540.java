package week5.day1;

public class SingleelementinSortedArray540 {
	/**
	 * Get the array and initiate low and high points. Then find mid point.
	 * Check the index of mid point if it's even and mid+1 is equal to mid then eliminate right part 
	 * else if mid is even index then mid-1 is equal to mid then eliminate left part and finally return mid
	 * 
	 */
	
	public static int singleNonDuplicate(int[] nums) {
		 if(nums.length==1){
	            return nums[0];
	        }
		 if(nums[0]!=nums[1]) {
			 return nums[0];
		 }
		 if(nums[nums.length-2]!=nums[nums.length-1]) {
			 return nums[nums.length-1];
		 }
		int low=0, high=nums.length-1, mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(mid%2==0&&nums[mid]==nums[mid+1]) {
				low=mid+1;
			}
			else if(mid%2==1&&nums[mid]==nums[mid-1]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return nums[mid];
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,4,8,8};
		int singleNonDuplicate = singleNonDuplicate(arr);
		System.out.println(singleNonDuplicate);
	}
}
