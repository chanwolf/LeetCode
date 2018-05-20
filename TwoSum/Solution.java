import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] answers= new int[2]; 
        
        
        HashMap<Integer,Integer> needed = new HashMap<Integer,Integer>() ; // <NUM TO FIND, INDEX OF THE INTIAL NUM> 
        
        for(int i = 0; i<nums.length; ++i){
            int differenceNeeded= target-nums[i];

            if (needed.containsKey(differenceNeeded)){
                answers[0] = needed.get(differenceNeeded);
                answers[1] = i;
                return answers;
            }

            needed.put(nums[i], i);


            
        }
        return answers;
        
        
        
    }





}