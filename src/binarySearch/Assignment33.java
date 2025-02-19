package binarySearch;

public class Assignment33 {
	
	/*
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
	 * Find row and column of the array using length constant. Initiate low pointer as 0 and 
	 * high pointer as row*col -1. Initiate a while loop and continues until high is less than or equal to low.
	 * Find rows and cols using mid variable and pass rows and cols variables in matrix indexes and assign it as
	 * mid value. if midVal is equals to target then return true. else if target is greater than midVal then
	 * change low = mid+1 or else high = mid-1. if no value is matched then return false.
	 */
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int row=matrix.length;
		int col=matrix[0].length;
		
		int low = 0, high=row*col-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int rows = mid/col;
			int cols = mid%col;
			int midVal = matrix[rows][cols];
			if(midVal==target) {
				return true;
			}
			else if(midVal<target) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return false;
	}

}
