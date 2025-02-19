package weeksixHomeworks;

import java.util.*;

public class countStudents {
	
	//
	/**
	 * 
	 * Get the two arrays which are students and sandwiches and declare variable unmatchedCount
	 * add 2 arrays value in std queue and sw queue respectively
	 * iterate the while loop and run until both the queues are empty
	 * Peek the head of both 2 queues and if it is match then poll (dequeue) elements and reset the unmatched counts
	 * other wise add std head element only in last of the queue
	 * if the unmatched count is equal to size then break the loop and return the queue size 
	 */
	
	public static int countStud(int[] students, int[] sandwiches) {
		Queue<Integer> std = new LinkedList<>();
		Queue<Integer> sw = new LinkedList<>();
		
		for(int q: students) {
			std.add(q);
		}
		
		for(int q1: sandwiches) {
			sw.add(q1);
		}
		
		int unmatchedCount=0;
		while(!std.isEmpty() && !sw.isEmpty()) {
			int stdFront = std.peek();
			int  swFront = sw.peek();
			if(stdFront==swFront) {
				std.poll();
				sw.poll();	
				unmatchedCount=0;
			}
			else {
				std.add(std.poll());
				unmatchedCount++;	
			}   
			if(unmatchedCount==std.size()) {
				break;
			}
		}
		return std.size();
		
	}
	
	public static void main(String[] args) {
		int[] students = {1, 1, 1, 0, 0, 1};
		int[] sandwiches = {1, 0, 0, 0, 1, 1};
		System.out.println(countStud(students, sandwiches));
	}

}
