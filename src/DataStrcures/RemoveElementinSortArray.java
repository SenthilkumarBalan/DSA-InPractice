package DataStrcures;

public class RemoveElementinSortArray {
	
	/**
	 Initialize a variable k =0 and get an array as input
	 if array size is equals to zero return zero (nothing is going to happen if arr is zero)
	 consider K as slow pointer and j as fast pointer
	 Means J will traverse the entire array and K will traverse if nums[k] is not equals to nums[j]
	 if condition satisfied then increment k and swap the value between k and j. 
	 return k+1 
	 */
	
	public static int removeDuplicate(int[] nums) {
		if (nums.length == 0) return 0;

        int k = 1; 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
            	 k++; // Move slow pointer forward
                nums[k] = nums[j]; 
               
            }
        }
        return k; 
	}
	
	public static void main(String[] args) {
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int removeDuplicate = removeDuplicate(nums);
		System.out.println(removeDuplicate);
	}

}
