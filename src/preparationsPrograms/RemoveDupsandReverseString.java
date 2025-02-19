package preparationsPrograms;
import java.util.*;

public class RemoveDupsandReverseString {
	
	public static String removeDupsandReverse(String s) {
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			Map<Character, Integer> output = new HashMap<>();
			for(char c: word.toCharArray()) {
				output.put(c, output.getOrDefault(c, 0)+1);
			}
			StringBuilder filtered = new StringBuilder();
			for(char c1: word.toCharArray()) {
				if(output.get(c1)==1) {
					filtered.append(c1);
				}
			}
			String sb1=filtered.reverse().toString(); 
		}
		return s;
	}
}