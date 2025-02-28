package gPTProblems;

import java.util.Arrays;

public class TwoPointers {

    public static int[] twoPointers(int[] nums, int target){
        int left=0, right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int []{left, right};
            }
            else if(nums[left]+nums[right]< target){
                left++;
            }
               right--;
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15}; int target=9;
        int[] twoSum = twoPointers(nums, target);
        System.out.println(Arrays.toString(twoSum));

        int[] nums1={1,2,1}; int target1 = 2;
        int[] twoSum1 = twoPointers(nums1, target1);
        System.out.println(Arrays.toString(twoSum1));

    }
}
