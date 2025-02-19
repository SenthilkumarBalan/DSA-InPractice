package preparationsPrograms;
import java.util.*;

public class RemovingZeros {
	
	public static int[] removingZero(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		for(int num: nums){
			list.add(num);
		}
		
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i)==0) {
				list.remove(i);
			}
		}
		int[] result = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			result[i]=list.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] num = {0,0,0,0,0};
		int[] removingZero = removingZero(num);
		System.out.println(Arrays.toString(removingZero));
	}

}
