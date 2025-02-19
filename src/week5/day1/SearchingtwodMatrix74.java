package week5.day1;

public class SearchingtwodMatrix74 {
	
	/**
	 * 
	 * Get two dimensional array and target as method parameter
	 * Find rows and columns of the matrix and assign in rows and cols variables.
	 * Initiate low and high variables and declare 0 for low and matrix.length-1 as column.
	 * Initiate while loop and traverse until low is less or equal to high.
	 * Find mid and find row and col to find an element in matrix. if [row] and [col] element is equal 
	 * to target then return true. if tartet is greater than [row] and [col] then move mid=mid+1 else move 
	 * high=mid-1;4
	 */
	
	
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
		
		 if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return false;
	        }
		 
		 int rows = matrix.length;
	     int cols = matrix[0].length;
	     
	     int low = 0, high = rows * cols - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int row = mid / cols;
	            int col = mid % cols;
	            if (matrix[row][col] == target) {
	                return true;
	            } else if (matrix[row][col] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
		
		return false;
		 
	    }
	 
	 public static void main(String[] args) {
		 
		 int[][] arr1= {{1,3}}; int target1=3;
		 boolean searchMatrix = searchMatrix(arr1,target1);
		 System.out.println(searchMatrix);
		 
		 int[][]arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; int target = 3;
		 boolean searchMatrix2 = searchMatrix(arr,target);
		 System.out.println(searchMatrix2);	
		 
		 int[][] arr2= {{1,1},{2,2}}; int target3 = 2;
		 boolean searchMatrix3 = searchMatrix(arr2,target3);
		 System.out.println(searchMatrix3);
	}

}
