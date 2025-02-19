package binarySearch;

import java.util.Arrays;

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
	 * Pseudo code:  Check if row and col multiplication does not match to the length of the original array 
	 * then return 2D empty array. Initiate a 2D array which is result and pass row and col in the array indices.
	 * find the row and col in result 2D array and assign it into original array.
 */

public class Assignment36 {
	
	public static int[][] construct2DArray(int[] original, int m, int n){
		
		if(original.length!=m*n) {
			return new int [0][0];
		}
		
		int result[][] = new int [m][n];
		for(int i=0;i<original.length;i++) {
			result [i/n][i%n]=original[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2}; int m=1, n=1;
		int[][] construct2dArray = construct2DArray(original, m, n);
		System.out.println(Arrays.toString(construct2dArray));
		
		int[] original1 = {1,2,3,4}; int m1=2, n1=2;
		int[][] construct2dArray1 = construct2DArray(original1, m1, n1);
		System.out.println(Arrays.deepToString(construct2dArray1));
		
		int[] original2 = {1,2,3}; int m2=1, n2=3;
		int[][] construct2dArray2 = construct2DArray(original2, m2, n2);
		System.out.println(Arrays.deepToString(construct2dArray2));
		
	}

}
