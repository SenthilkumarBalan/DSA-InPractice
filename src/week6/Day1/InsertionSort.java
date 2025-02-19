package week6.Day1;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] insertionSort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int j=i-1;
			int curr = nums[i];
			
			while(j>=0 && nums[j]>curr) {
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=curr;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,0};
		int[] insertionSort = insertionSort(arr);
		System.out.println(Arrays.toString(insertionSort));
	}

}
