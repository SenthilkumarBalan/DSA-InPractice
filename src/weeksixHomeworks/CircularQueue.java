package weeksixHomeworks;



public class CircularQueue {
	
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int count; 
	
	
	
	public CircularQueue(int k) {
		this.size=k;
		this.queue = new int[k];
		this.front=-1;
		this.rear=-1;
		this.count=0;
	}
	
	public boolean isEmpty() {
       return front ==-1;
    }
	
	public int Front() {
		if(isEmpty()) {
		return -1;	
		}
		return queue[front];
    }
	
	public int Rear() {
		if(isEmpty()) {
			return -1;
		}
        return queue[rear];
    }
	
	public boolean isFull() {
        return (rear+1)%size==front;
    }
	
	public boolean enQueue(int value) {
        if(isFull()) {
        	return false;
        }
        if(isEmpty()) {
        	front=0;
        }
        rear=(rear+1)%size;
        queue[rear]=value;
        count++;
        return true;
    }
	
	public boolean deQueue() {
		if(isEmpty()) {
			return false;
		}
		front = (front+1)%size;
		count--;
		if (count == 0) { // Reset pointers when queue becomes empty
            front = 0;
            rear = -1;
        }
		return true;
    }

}
