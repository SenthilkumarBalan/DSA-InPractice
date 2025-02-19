package week6.Day1;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] nums) {
        helper(nums, 0, nums.length - 1); // First recursive call
        return nums;
    }

    public static void helper(int[] nums, int low, int high) {
        // Base case - when to stop recursion
        if (low >= high) return;

        // Find mid point
        int mid = (low + high) / 2;

        // Recurrence relations - smaller sub-problems
        helper(nums, low, mid);         // Left half
        helper(nums, mid + 1, high);   // Right half

        // Post-recursion: merge the two halves
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        // Initialize two pointers and create subarrays
        int p1 = 0, p2 = 0, index = low;
        int[] left = Arrays.copyOfRange(nums, low, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);

        // Merge the two subarrays
        while (p1 < left.length && p2 < right.length) {
            if (left[p1] <= right[p2]) {
                nums[index++] = left[p1++];
            } else {
                nums[index++] = right[p2++];
            }
        }

        // Copy remaining elements from the left array
        while (p1 < left.length) {
            nums[index++] = left[p1++];
        }

        // Copy remaining elements from the right array
        while (p2 < right.length) {
            nums[index++] = right[p2++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Original Array: " + Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}