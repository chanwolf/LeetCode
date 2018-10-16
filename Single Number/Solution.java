import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> temp = new HashMap<Integer,Integer>();

		for(int i= 0; i<nums.length; ++i){
			if(temp.get(nums[i]) != null){
				temp.put(nums[i], 2);
			}else
				temp.put(nums[i],1);
		}

		for(int keys: temp.keySet()){
			if(temp.get(keys) == 1)
				return keys;
		}
		return -1;
    }
}