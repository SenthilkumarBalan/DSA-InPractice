package week6.Day1;

import java.util.Arrays;

public class MergeIntervals {
	
	
    public static void main(String[] args) {
    	 int[][] nums={{0,30},{5,10},{15,20}};
    	 int[][] nums1={{1,4},{5,7},{8,14}};
    	 boolean merrgeIntervals = merrgeIntervals(nums);
    	 System.out.println(merrgeIntervals);
    	 boolean merrgeIntervals2 = merrgeIntervals(nums1);
    	 System.out.println(merrgeIntervals2);
	}

    public static boolean merrgeIntervals(int[][] nums) {

        boolean result=true;
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int sTime=nums[0][0];
        int eTime=nums[0][1];
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i][0]<=eTime)
           {
               result=false;
           }
           else {
               sTime=nums[i][0];
               eTime=nums[i][1];
           }
        }


        return result ;
    }


}
