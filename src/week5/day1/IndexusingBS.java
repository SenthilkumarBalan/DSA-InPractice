package week5.day1;

public class IndexusingBS {
	
	public static int brutefindIndex(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findIndex(int[] nums, int target) {
		int low=0, high=nums.length-1; 
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
					low=mid+1;
				}
			else
				high=mid-1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,5,6}; int target=2;
		int[] arr1= {130,120,110}; int target1=12;
		int[] arr2 = {4,5,6,7,0,1,2}; int target2=0;
//		int brutefindIndex = brutefindIndex(arr,target);
//		System.out.println(brutefindIndex);
//		int brutefindIndex2 = brutefindIndex(arr1,target1);
//		System.out.println(brutefindIndex2);
		int index = findIndex(arr, target);
		System.out.println(index);
		int index2 = findIndex(arr1,target1);
		System.out.println(index2);
		int index3 = findIndex(arr2, target2);
		System.out.println(index3);
	}

}
