package week5.day1;

import java.util.Arrays;

public class FirstandLastPosArray34 {
	
	public static int[] searchRange(int[] nums, int target) {
		int[] result = {-1, -1}; 
	    
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) {
                result[0] = mid;
            }
        }

        low = 0; high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                result[1] = mid;
            }
        }
        
        return result;
			
	}
	
	public static void main(String[] args) {
		int[]arr = {5,7,7,8,8,10}; int target=8;
		int[] arr1= {1}; int target1 = 1;
		int[]arr2 = {3,1}; int target2=1;
		int[]arr3 = {2,2}; int target3=2;
		int[] searchRange = searchRange(arr,target);
		int[] searchRange2 = searchRange(arr1,target1);
		int[] searchRange3 = searchRange(arr2,target2);
		int[] searchRange4 = searchRange(arr3,target3);
		System.out.println(Arrays.toString(searchRange));
		System.out.println(Arrays.toString(searchRange2));
		System.out.println(Arrays.toString(searchRange3));
		System.out.println(Arrays.toString(searchRange4));
	}

}
