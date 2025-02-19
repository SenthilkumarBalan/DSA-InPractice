package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharacterPangram {
	
	public static boolean checkIfPangram(String sentence) {
	    char[] characters=sentence.toCharArray();
	    Arrays.sort(characters);
	    Set<Character> output = new HashSet<>();
	    for(char c : characters) {
	    	output.add(c);
	    }
	    char[] actChar = new char[26];
	    for(char i=0;i<26;i++) {
	    	actChar[i]=(char) ('a'+i);
	    }
	    for(char c: actChar) {
	    	if(!output.contains(c)) {
	    		return false;
	    	}
	    }
	    return true;
	    
	    /**
	     * Alternate method
	     * char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
       return set.size() == 26;
	     */
	}
	
	public static void main(String[] args) {
		String s = "thequickbrownfoxjumpsoverthelazydog";
		String s1="leetcode";
		boolean checkIfPangram = checkIfPangram(s);
		boolean checkIfPangram2 = checkIfPangram(s1);
		System.out.println(checkIfPangram);
		System.out.println(checkIfPangram2);
		
	}
	

}
