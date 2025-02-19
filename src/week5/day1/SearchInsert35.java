package week5.day1;

public class SearchInsert35 {
	
	public int brutesearchInsert(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			
		}
		
		return target;
		
	}
	
	public static int searchInsert(int[] nums, int target) {
		 int low = 0, high = nums.length - 1,  mid=0;
		while (low <= high) {
	        mid = (low + high) / 2;
	        if (nums[mid] == target) {
	            return mid; 
	        } else if (nums[mid] < target) {
	            low = mid + 1; 
	        } else {
	            high = mid - 1; 
	        }
	    }
	    return low; 
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,5,6}; int target = 5;
		int[] arr1= {1,3,5,6}; int target1=2;
		int[] arr2= {1,3,5,6}; int target2=7;
		int searchInsert = searchInsert(arr, target);
		int searchInsert2 = searchInsert(arr1, target1);
		int searchInsert3 = searchInsert(arr2, target2);
		System.out.println(searchInsert);
		System.out.println(searchInsert2);
		System.out.println(searchInsert3);
	}
	
	

}
