package week3.day2;

public class Anagram {
	
	public boolean anagram(String s1, String s2) {
		String reversed = "";
		for(int i=s2.length()-1;i>=0;i--) {
			reversed+=s2.charAt(i);
			if(reversed==s1) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "geeks"; String s2="kseeg";
		
	}

}
