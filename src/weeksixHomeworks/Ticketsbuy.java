package weeksixHomeworks;
import java.util.*;
public class Ticketsbuy {
	
	/*
	 * add array values into queue and initiate count variable and assign zero
	 * Iterate over the while loop and dequeue front element and decrement k to track the target element
	 * Subtract with 1 with front element and add it into queue end if is > 0 and increment the count
	 * if k is less than 0 and front is equal to 1 then break the element and return count else assign k as 
	 * queue size -1
	 */
	
	public static int timeRequiredToBuy(int[] tickets, int k) {
		
		Queue<Integer> queue = new LinkedList<>();
	    for (int ticket : tickets) {
	        queue.add(ticket);
	    }
	    
	    int count = 0;
	    while (true) {
	        int front = queue.poll();
	        k--; 
	        if (front - 1 > 0) {
	            queue.add(front - 1);
	        }
	        count++;
	        
	        if (k < 0) { 
	            if (front == 1) {
	                break;
	            } else {
	                k = queue.size() - 1; 
	            }
	        }
	    }
	    
	    return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,3,1}; int k=2;
		int[] arr1 = {5,1,1,1}; int k1=0;
		int timeRequiredToBuy = timeRequiredToBuy(arr, k);
		int timeRequiredToBuy1 = timeRequiredToBuy(arr1, k1);
		System.out.println(timeRequiredToBuy);
		System.out.println(timeRequiredToBuy1);
	}

}
