package DataStrcures;

import java.util.*;

	/**
	 * Get an array as method parameter and sort it. Initialize a List data structure and also a list
	 * as collection generics. Initialize a for loop and loop continues until array value is reaches
	 * to second last value. 
	 *  Make a if condition where if index is greater than zero and array value is equal to previous 
	 *  element and skips the loop in-order to avoid duplicate triplets.
	 *  Initialize left and right variables where left value is next element of an array and right value is 
	 *  second last value of the array.
	 *  Make a while loop and control goes to inside of the loop if right value is greater than left.
	 *  if condition is true then checking a condition that if the sum of i, left and right are zero
	 *  then add i, left and right as an array in list collection and increment the both right and left finally
	 * 	return list of list.
	 *  meanwhile it checks in array if left and it next value is same then increment left
	 *  Same as in array if right value and it previous value is equal then decrement right
	 *  else if 0 is greater than the sum of array of i, left and right increment left
	 *  if 0 is less than the sum of array of i, left and right increment right.
	 *  
	 */

public class Threesum {
	
	public static List<List<Integer>> threeSum(int[] num) {
	
		Arrays.sort(num);
		List<List<Integer>> output = new ArrayList<>();
		
		
		for(int i=0;i<num.length-2;i++) {
			if(i>0 && num[i] == num[i-1]) {
				continue;
			}
			 int left = i+1; int right=num.length-1;
			 while(left<right) {
					if(num[i]+num[left]+num[right]==0) {
						output.add(Arrays.asList(num[i],num[left],num[right]));
						while(left<right &&num[left]==num[left+1]) {
							left++;
						}
						while(left<right && num[right]==num[right-1]) {
							right--;
						}
						left++;
						right--;
					}
					else if(num[i]+num[left]+num[right]<0) {
						left++;
					}
					else {
						right--;
					}
			 
		}
			
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,0};
		List<List<Integer>> threeSum = threeSum(arr);
		System.out.println(threeSum);
	}
		
	
}

