import java.util.*;
import java.math.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<Integer,Integer>();
        int majorityAmount = (int) Math.floor(nums.length/2);
        
        for(int i=0; i<nums.length; ++i){
            if(counter.containsKey(nums[i])){
                int newCount = counter.get(nums[i]) +1;
                if(newCount > majorityAmount)
                    return nums[i];
                counter.put(nums[i],newCount);
            }else{
                counter.put(nums[i],1);
                if(1 > majorityAmount)
                    return nums[i];
            }
            
        }
        return 0;
    }
}