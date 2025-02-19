package assessment;

public class Problem2 {
	/**
	 * Use 2 pointers low and high to track the current elements
	 * Initiate a while loop and loop will run until low is less than or equal to high
	 * Find mid value for each searches, so initiated inside of while loop
	 * Find whether left search is sorter or right side is sorted using a conditional statement
	 * if left side is sorted then if the target is within this range, narrow the search to this range 
	 * by updating high = mid - 1 other wise low = mid+1
	 * if right side is sorted then if the target is with in the range narrow the search
	 *  to this range by updating left = mid + 1
	 */
	public static int findIndexafterroatated(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target < nums[mid]) {
					high=mid-1;
				}
				else
					low=mid+1;
			}
			else
				if(nums[mid]<target && target <=nums[high]) {
					low=mid+1;
				}
				else
					high = mid-1;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2}; int target = 0;
		int indexafterroatated = findIndexafterroatated(nums, target);
		System.out.println(indexafterroatated);
		int[] nums1 = {4,5,6,7,0,1,2}; int target1 = 3;
		int indexafterroatated1 = findIndexafterroatated(nums1, target1);
		System.out.println(indexafterroatated1);
		int[] nums2 = {1}; int target2 = 0;
		int indexafterroatated2 = findIndexafterroatated(nums2, target2);
		System.out.println(indexafterroatated2);
	}

}
