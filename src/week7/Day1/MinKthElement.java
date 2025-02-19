package week7.Day1;
import java.util.*;
public class MinKthElement {
	
	public static int minElement(int[] nums, int k) {
		int answer=0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<nums.length;i++) {
			pq.add(nums[i]);
		}
		while(k>0) {
			answer = pq.poll();
			k--;
		}
		return answer;
	}
	
	

	
	public static void main(String[] args) {
		int[] nums= {1,2,5,6,4}; int k=1;
		int minElement = minElement(nums,k);
		System.out.println(minElement);
	}

}
