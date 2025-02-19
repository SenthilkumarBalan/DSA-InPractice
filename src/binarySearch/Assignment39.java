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
	 * Verify if nums.length == 1 then return nums[0] which is the single element in an array.
	 * if(nums[low]<=nums[high] then return nums[low] and this condition well suite if array has only 2 elements.
	 * initiate low, high variables and initiate a while loop and it should execute until low is less than high.
	 * find mid point by using int mid=(low+high)/2; 
	 * Make a if condition and if nums[mid] is greater than nums[high] then low=mid+1 other wuse high =mid 
	 * and finally return nums[low]
 */

public class Assignment39 {
	
	public static int findMin(int[] nums) {
		
		if(nums.length==1) {
			return nums[0];
		}
		
		int low=0, high=nums.length-1;
		
         if(nums[low]<=nums[high]) {
				return nums[low];
			}  
       
		while(low<high) {
			int mid=(low+high)/2;
			if(nums[mid]>nums[high]) {
				low=mid+1;
			}
			else
				high=mid;
		}
		return nums[low];
	}
	
	public static void main(String[] args) {
		int[] nums= {3,4,5,1,2};
		int min = findMin(nums);
		System.out.println(min);
		
		int[] nums1= {4,5,6,7,0,1,2};
		int min2 = findMin(nums1);
		System.out.println(min2);
		
		int[] nums2 = {11,13,15,17};
		int min3=findMin(nums2);
		System.out.println(min3);
		
		int[] nums3 = {1};
		int min4 = findMin(nums3);
		System.out.println(min4);
	}

}
