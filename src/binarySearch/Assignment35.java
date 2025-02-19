package binarySearch;

/**
 * Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s) type? 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, Edge, Negative
	 * Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? 
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code // Bruteforce
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 * Pseudo code:
	 * if X is less than 2 then return x. 
	 * Initiate low =1, high = x/2; 
	 * Initiate a while loop and it should run until low is less than or equal to high.
	 * Find mid value by using this formula = low+(high-low)/2;
	 * Find square value of mid and if that is equals to x then return mid.
	 * If mid square is less than the target then low = mid+1; else high = mid-1.
	 * Finally return high.
	 *  
 */
public class Assignment35 {
	
	public static int mySqrt(int x) {
		if(x<2) {
			return x;
		}
		
		int low = 1, high = x/2;
		while(low<=high) {
			int mid = low+(high-low)/2;
			long midSquare = (long) mid*mid;
			if(midSquare==x) {
				return mid;
			}
			else if(midSquare<x) {
				low =mid+1;
			}
			else
				high = mid-1;
		}
		return high;
	}
	
	public static void main(String[] args) {
		int a = 2;
		int mySqrt = mySqrt(a);
		System.out.println(mySqrt);
		int b = 4;
		int mySqrt2 = mySqrt(b);
		System.out.println(mySqrt2);
		int c = 8;
		int mySqrt3 = mySqrt(c);
		System.out.println(mySqrt3);
	}

}
