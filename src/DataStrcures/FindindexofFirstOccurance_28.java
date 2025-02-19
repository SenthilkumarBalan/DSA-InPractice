package DataStrcures;

public class FindindexofFirstOccurance_28{
	/**
	 * Get 2 string objects as input and get it length and store it in 2 different variables called 
	 * n for haystack and m for needle. create two variables called i and j and initiate as zero. 
	 * create while loop and make it iterate until i is less than the length of haystack string object.
	 * create a if conditional statement and compare each characters of haystack and needle objects.
	 * if condition is match then increment the both i and j.
	 * if j variable equals to needle length then return i-j.
	 * else make i is equal to i-j+1 and j=0. 
	 * if no conditional statement met then return 0.
	 */ 
	
	public static int findIndex(String haystack, String needle) {
		int n = haystack.length();
		int m = needle.length();
		if(m>n) {
			return -1;
		}
		int i=0;
		int j=0;
		while(i<n) {
			if(haystack.charAt(i)==needle.charAt(j)) {
				i++;
				j++;
	
				if(j==m) {
					return i-j;
				}
				return i-j;
			}
			
			else {
				i=i-j+1;
				j=0;
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		FindindexofFirstOccurance_28 fi = new FindindexofFirstOccurance_28();
		String haystack = "sad";
		String needle= "dad";
		int output = fi.findIndex(haystack, needle);
		System.out.println(output);
	}
}
