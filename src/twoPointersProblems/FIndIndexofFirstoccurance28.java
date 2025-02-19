package twoPointersProblems;

public class FIndIndexofFirstoccurance28 {
	
	public static int findOccurance(String haystack, String needle) {
		
		if (needle.length() > haystack.length()) {
		    return -1;
		}

		int left = 0, right = 0;
		while (left < haystack.length()) { 
		    if (haystack.charAt(left) == needle.charAt(right)) {
		        right++; 
		        if (right == needle.length()) { 
		            return left - needle.length()+1; 
		        }
		    } else {
		        left -=right; 
		        right = 0; 
		    }
		    left++; 
		}

		return -1; 
	}
	
	public static void main(String[] args) {
		String a ="sad", b="sa";
		int occurance = findOccurance(a,b);
		System.out.println(occurance);
	}

}
