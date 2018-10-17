class Solution {
    public static int maxSubArray(int[] nums) {
        if(nums.length <= 0)
            return 0;    
        int max = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; ++i){
            if(nums[i] > max)
                max = nums[i];
            int concurrent = nums[i];
            for(int j=i+1; j<nums.length; ++j){
                concurrent += nums[j];
                if(concurrent > max)
                    max = concurrent;
            }
        }


        return max;

    }
}