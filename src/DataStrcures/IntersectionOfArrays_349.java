package DataStrcures;

import java.util.*;

	/**
	 * Get two arrays in method's parameter and sort those. Initialize i and j variables and assign zero.
	 * Initialize set and create a while loop and if control goes inside to the while loop if i and j 
	 * variables are less than the both arrays. If first array value and second array values are same
	 * then add first array value into set and increment both i and j. 
	 * else if second array value is greater than first array then increment i.
	 * else first array value is greater than second array then increment j
	 * 
	 * Initialize an array with the length of set data structure size and initiate an enhanced array for loop
	 * and add the set values to array indexes.
	 */


public class IntersectionOfArrays_349 {
	
	public static int[] interSection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0; int j=0;
		Set<Integer> output = new HashSet<Integer>();
		while(i<nums1.length && j< nums2.length) {
			if(nums1[i]==nums2[j]) {
				//outputArr[i]=nums1[i];
				output.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]<nums2[j]) {
				i++;
			}
			else
				j++;
		}
		int[] outputArr = new int[output.size()];
		int index=0;
		for(int arr: output) {
			outputArr[index++]=arr;
		}
		
		return outputArr;
	}
	
	public static void main(String[] args) {
		int[] num1 = {8,0,3}; int[] nums2 = {0,0};
		int[] interSection = interSection(num1, nums2);
		System.out.println(Arrays.toString(interSection));
	}

}
