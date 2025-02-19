package leetcode;

import java.math.BigInteger;
import java.util.*;

public class Day17AddArrayformofInteger {
	
	public static List<Integer> addToArrayForm(int [] num, int k){
		
		BigInteger carry = BigInteger.ZERO; 
		for (int numb : num) {
			carry = carry.multiply(BigInteger.TEN).add(BigInteger.valueOf(numb));
			//equivalent tp carry*10+num;
		} 
		BigInteger finalintVal = carry.add(BigInteger.valueOf(k)); 
		String finValue = finalintVal.toString(); 
		int[] resultArray = new int[finValue.length()]; 
		for (int i = 0; i < finValue.length(); i++) { 
			resultArray[i] = Character.getNumericValue(finValue.charAt(i));
			} 
		List<Integer> results = new ArrayList<>();
		for (int res : resultArray){
			results.add(res); 
			} 
		return results;
	}
		
	
	public static void main(String[] args) {
		int[] num= {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		 List<Integer> toArrayForm = addToArrayForm(num, 516);
		System.out.println(toArrayForm);
		}
	
}
