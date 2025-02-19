package weeksixHomeworks;

import java.util.*;



public class RemoveFirstKElements {
	
	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k){
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<k;i++) {
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}

		int remainSize = q.size()-k;
		for(int i=0;i<remainSize;i++) {
			q.add(q.poll());
		}
		return q;
		
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		int[] arr = {1,2,3,4,5}; int k=3;
		for(int q : arr) {
			queue.add(q);
		}
		Queue<Integer> modifyQueue = modifyQueue(queue, k);
		System.out.println(modifyQueue);
	}

}
