package DataStrcures;

import java.util.Arrays;

//Pseduo code:
//	1. Get array and give array and target value as input
//  2. Initiate while loop and make condition as K less than are equal to J.
//  3. make if condition and verify nums[k] is equal to target value, if condition met then replace 
//	nums[k] with nums[j] and decrement the j. otherwise increment k. finally return k



public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		int k=0; int j=nums.length-1;
		while (k <= j) {
            if (nums[k] == val) {
                nums[k] = nums[j];
                j--; 
            } else {
                k++; 
            }
            
        }
		
		return k;
		
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,2,3,0,4,2};
		int k=2;
		int removeElement = removeElement(arr, k);
		System.out.println(removeElement);
	}

}
