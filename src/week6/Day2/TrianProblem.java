package week6.Day2;

import java.util.Arrays;

public class TrianProblem {
	
	public static int findPlatform(int[] arr, int[] dep) {
		
		int p1=0,p2=0, platform=0,count=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[p1]<=dep[p2])
            {
                count++;
                p1++;
                platform=Math.max(platform,count);
            }
            else {
                count--;
                p2++;
            }
        }
        return platform;	
	}
	
	public static void main(String[] args) {
		int arr[]={900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int platform = findPlatform(arr, dep);
        System.out.println(platform);
        
        int arr1[]={900, 1235, 1100}, dep1[] = {1000, 1240, 1200};
        int platform1 = findPlatform(arr1, dep1);
        System.out.println(platform1);


	}

}
