package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FruitsintoBaskets904 {
	
	//bruteforce
	/**
	 * Create sub array of given array and store it in separate array
	 * verify 2 more element should not present in a sub array
	 * Find that sub-array and find it length.
	 */
	public static int bruteforceFruits(int[] fruits) {
		int maxCount=0;
		
		for(int i=0;i<fruits.length;i++) {
			HashSet<Integer> output = new HashSet<>();
			int count=0;
			for(int j=i;j<fruits.length;j++) {
				output.add(fruits[j]);
				if(output.size()>2) {
					break;
				}
				count++;
			}
			maxCount=Math.max(maxCount, count);
		}
		
		return maxCount;
	}
	
	
	public static int fruitsBucket(int[] fruits) {
		int maxCount=0, p1=0;
		Map<Integer, Integer> output = new HashMap<>();
		for(int p2=0;p2<fruits.length;p2++) {
			output.put(fruits[p2], output.getOrDefault(fruits[p2], 0)+1);
			while(output.size()>2) {
				output.put(fruits[p1], output.getOrDefault(fruits[p1], 0)-1);
				if(output.get(fruits[p1])==0) {
					output.remove(fruits[p1]);
				}
				p1++;
			}
			maxCount=Math.max(maxCount, p2-p1+1);
		}
		
		return maxCount;
	
	}
	public static void main(String[] args) {
		int[] arr= {1,2,1};
		int[] arr1= {0,1,2,2};
		int[] arr2= {1,2,3,2,2};
//		int bruteforceFruits = bruteforceFruits(arr);
//		int bruteforceFruits2 = bruteforceFruits(arr1);
//		int bruteforceFruits3 = bruteforceFruits(arr2);
//		System.out.println(bruteforceFruits);
//		System.out.println(bruteforceFruits2);
//		System.out.println(bruteforceFruits3);
		int fruitsBucket = fruitsBucket(arr);
		int fruitsBucket2 = fruitsBucket(arr1);
		int fruitsBucket3 = fruitsBucket(arr2);
		System.out.println(fruitsBucket);
		System.out.println(fruitsBucket2);
		System.out.println(fruitsBucket3);
	}
	

}
