package week5.day1;

public class Findpeakelement162 {

	public static int findPeakElement(int[] nums) {
		
		 if(nums.length==1) {
				return 0;
			}
	       
	        int low=0, high=nums.length-1, mid=0;
			while(low<high) {
				mid=(low+high)/2;
				if(nums[mid]<nums[mid+1]) {
					low=mid+1;
				}
				else
					high=mid;
			}
			return low;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1};
		int[] arr1= {1,2,1,3,5,6,4};
		int peakElement = findPeakElement(arr);
		System.out.println(peakElement);
		int peakElement2 = findPeakElement(arr1);
		System.out.println(peakElement2);
	}
}
