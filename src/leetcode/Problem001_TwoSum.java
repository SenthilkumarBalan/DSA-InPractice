package assessment;
import java.util.*;

public class Problem001_TwoSum {
	
	public static int[] twoSum(int[] num, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<num.length;i++) {
			map.put(num[i], i);
		}
		for(int i=0;i<num.length;i++) {
			int gap = target - num[i];
			if(map.get(gap)!=null&&map.get(gap)!=i) {
				result[0]=i;
				result[1]=map.get(gap);
			}
		}
		return result;
	}

}
