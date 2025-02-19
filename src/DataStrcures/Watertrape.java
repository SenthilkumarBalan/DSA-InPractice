package DataStrcures;

	/**
	 * 	
	 *  Initiate an array as method parameter and initiate leftMaxHeights and rightMaxHeights 
	 *  as array length respectively and initialize ans variable to store the final output. 
	 *  Assign first element of leftMaxHeights as arrays first element.
	 *  Assign second last index of array as second last index of rightMaxHeights.
	 *  Initialize a for loop and initialize as first index of array and execute till array lenght with
	 *  incremental manner. store left max height in leftMaxHeights.
	 *  Initialize another for loop and initialize the second largest value of rightMaxHeights array and it
	 *  executes until 0th index and decrement in nature.
	 *  Initialize a for loop and it executes from 0th index of an array and till it length in increment manner.
	 *  The formula max height - array value is used to retrieve the indexes of water trapped and it 
	 *  subtracts to array value. 0 has been added in max method if formula gives a negetive value
	 *  it technically not possible to produce as output. 
	 *  each of the indexes will be added into sum variable which is the actual output.
	 */

public class Watertrape {
	
	public static int storeWater(int[] nums) {
		int ans=0;
		int[] leftMaxHeights = new int[nums.length];
		int[] rightMaxHeights = new int[nums.length];
		
		leftMaxHeights[0]= nums[0];
		rightMaxHeights[rightMaxHeights.length-1]= nums[nums.length-1];
		
		for(int i=1;i<nums.length;i++) {
			leftMaxHeights[i] = Math.max(leftMaxHeights[i-1], nums[i]);
		}
		
		for(int i=rightMaxHeights.length-2;i>=0;i--) {
			rightMaxHeights[i] = Math.max(rightMaxHeights[i+1], nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			ans=ans+Math.max(0,Math.min(leftMaxHeights[i], rightMaxHeights[i])-nums[i]);
			//ans=ans+Math.min(leftMaxHeights[i], rightMaxHeights[i]-nums[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		int storeWater = storeWater(arr);
		System.out.println(storeWater);
	}

}
