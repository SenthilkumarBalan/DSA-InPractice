package week4.day2;
import java.util.*;

public class LongestSubstringWOduplicates {
	
	public static int lengthOfLongestSubstringusingmap(String s) {
		if(s.length()==0) {
			return 0;
		}
		int left=0, right=0, maxLen=Integer.MIN_VALUE;
		HashMap<Character, Integer> output = new HashMap<>();
		while(right<s.length()) {
			output.put(s.charAt(right), output.getOrDefault(s.charAt(right), 0)+1);
			while(output.get(s.charAt(right))>1) {
				output.put(s.charAt(left), output.getOrDefault(s.charAt(left), 0)-1);
				left++;
			}
			maxLen=Math.max(maxLen, right-left+1);
			right++;
		}
		return maxLen;
	}
	
	
	public static int lengthOfLongestSubstringusingascii(String s) {
		int[] ascii = new int[26];
		for(int i=0;i<s.length();i++) {
			ascii[i]=-1;
		}
		int maxLen=0, start=0;
		for(int end=0;end<s.length();end++) {
			char currentChar = s.charAt(end);
			int asciiIndex=(int) currentChar;
			if(ascii[asciiIndex]>=start) {
				start = ascii[asciiIndex]+1;
			}
			ascii[asciiIndex]=end;
			maxLen=Math.max(maxLen, end-start+1);
		}
		return maxLen;
		
	}
	public static void main(String[] args) {
		String s="abcabcbb";
		String s1="bbbbb";
		String s2="pwwkew";
		String s3="";
		int lengthOfLongestSubstring = lengthOfLongestSubstringusingmap(s);
		int lengthOfLongestSubstring2 = lengthOfLongestSubstringusingmap(s1);
		int lengthOfLongestSubstring3 = lengthOfLongestSubstringusingmap(s2);
		int lengthOfLongestSubstring4 = lengthOfLongestSubstringusingmap(s3);
		System.out.println(lengthOfLongestSubstring);
		System.out.println(lengthOfLongestSubstring2);
		System.out.println(lengthOfLongestSubstring3);
		System.out.println(lengthOfLongestSubstring4);
	}

}
