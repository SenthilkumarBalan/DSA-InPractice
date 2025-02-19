package week3.day2;

/**
 * Initiate an array as method parameter and initiate left, right and total variable and assign 0 
 * respectively. add each element in array and store it in total variable.
 * Assign total variable onto right variable. 
 * Initiate an another for loop and iterate each element and add the sum of one by one element 
 * into left variable. if left value is equal to right value then return the index or 
 * else add current value into left element
 */
public class PivotIndex {
	
	
	public static int pivotIndexes(int[] nums) {
		
		int left =0; int right=0; 
		for(int i=0;i<nums.length;i++) {
			right+=nums[i];
		}
	
		for(int i=0;i<nums.length;i++) {
			left+=nums[i];
			if(left==right) {
				return i;
			}
			else
			left+=nums[i];
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {2,1,-1};
		int[] arr1= {1,7,3,6,5,6};
		int pivotIndexes = pivotIndexes(arr);
		int pivotIndexes2 = pivotIndexes(arr1);
		System.out.println(pivotIndexes);
		System.out.println(pivotIndexes2);
		
		}
	}


