package DataStrcures;
import java.util.*;
import java.util.Map.Entry;
/**
 *  Initialize an array as method parameter and initialize a map data structure.
 *  Iterate the array over a loop and make a condition if nums value is already present in the map or not
 *  If the key which means array value is exist then assign array value as key in map and using getorDefault
 *  method increment it value +1.
 *  if it does not contains then add it assign value as 1.
 *  output.values() return the size of the total number of counts.
 *  occurrences.size() gives the number of unique counts. if bothe are matches then returns true else false
 */

public class UniquenoOfOccurances {
	
	public static boolean uniqueOccurnaces(int[] nums) {
		Map<Integer, Integer> output = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(output.containsKey(nums[i])) {
				output.put(nums[i], output.getOrDefault(nums[i], 0)+1);	
				
			}
			else {
				output.put(nums[i], 1);
			}
		}
		Set<Integer> occurrences = new HashSet<>(output.values()); 
		return output.values().size() == occurrences.size();
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		int[] arr1 = {1,2};
		int[] arr2= {-3,0,1,-3,1,1,1,-3,10,0};
		boolean uniqueOccurnaces = uniqueOccurnaces(arr);
		boolean uniqueOccurnaces2 = uniqueOccurnaces(arr1);
		boolean uniqueOccurnaces3 = uniqueOccurnaces(arr2);
		System.out.println(uniqueOccurnaces);
		System.out.println(uniqueOccurnaces2);
		System.out.println(uniqueOccurnaces3);
		
	}
	
	

}
