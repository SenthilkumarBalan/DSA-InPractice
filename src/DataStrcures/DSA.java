package DataStrcures;

import java.util.*;

public class DSA {
	
	public static ArrayList<List<String>> groupAnagram(List<String> input) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<input.size();i++) {
            String eachstr = input.get(i);
            ArrayList<String> valueList = new ArrayList<>();
            valueList.add(eachstr);
            char[] charArray = eachstr.toCharArray();
            Arrays.sort(charArray);
            String sortedArray = String.valueOf(charArray);
            if(!map.containsKey(sortedArray)) {
                map.put(sortedArray, valueList);
            }else {
                List<String> list = map.get(sortedArray);
                list.addAll(valueList);
                map.put(sortedArray, list);
            }
        }
        Collection<List<String>> values = map.values();
        return new ArrayList<>(values);

    }

    public void test01(){
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<String> asList = Arrays.asList(str);
        List<List<String>> result = groupAnagram(asList);
    }

}