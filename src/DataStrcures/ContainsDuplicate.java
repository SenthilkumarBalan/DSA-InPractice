package DataStrcures;
import java.util.*;

 /**
  * Initialize the map and get an array and target value as input
  * start for loop and iterate over the array. if array values are same then indexes subtraction 
  * should be less than or equal to target value. if less or equal return true 
  * or else return false
  */
public class ContainsDuplicate {
	
	
	public static boolean containsDuplicate(int[] nums, int target) {
		Map<Integer, Integer> output = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(output.containsKey(nums[i])) {
				if(i-output.get(nums[i])<=target) {
					return true;
				}
			}
			output.put(nums[i], i);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1}; int k=3;
		boolean containsDuplicate = containsDuplicate(arr, k);
		System.out.println(containsDuplicate);
		
	}

}
