package binarySearch;

/**
 * Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s) type? 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, Edge, Negative
	 * Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? 
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code // Bruteforce
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * Pseudo code:
	 * Initiate low, high.
	 * while(low<=high)
	 * declare mid
	 * if(nums[mid]==target)
	 * return true;
	 * if(nums[low]==nums[mid] && nums[high]==nums[mid] then increment low and decrement high.
	 * if(nums[low]<=nums[mid] then check another if condition
	 * if(nums[low]<=target and nums[mid]> target
	 * then high =mid-1 else low= mid+1
	 * else check another if condition
	 * if(nums[high]>=target and nums[mid]<target
	 * then low=mid+1 else high=mid-1
	 * 
 */

public class Assignment37 {
	
	
	public static boolean search(int[] nums, int target) {
		
		int low = 0, high = nums.length - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2; 
	        if (nums[mid] == target) {
	            return true;
	        }

	        if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
	            low++;
	            high--;
	            continue;
	        }

	        if (nums[low] <= nums[mid]) {
	            if (nums[low] <= target && nums[mid] > target ) {
	                high = mid - 1; 
	            } else {
	                low = mid + 1; 
	            }
	        } 
	       
	        else {
	            if (nums[high] >= target  && nums[mid] < target ) {
	                low = mid + 1; 
	            } else {
	                high = mid - 1; 
	            }
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		int[] nums= {2,5,6,0,0,1,2}; int target = 0;
		boolean search = search(nums, target);
		System.out.println(search);
		
		int[] nums1= {2,5,6,0,0,1,2}; int target1=3;
		boolean search2 = search(nums1, target1);
		System.out.println(search2);
		
		
		
	}

}
