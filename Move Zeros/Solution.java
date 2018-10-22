class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <=1)
            return;
        int lastZeroIndex = -1;

        for(int i = 0; i<nums.length; ++i){
        	if(nums[i] == 0 && lastZeroIndex == -1)
                lastZeroIndex = i;
            if(nums[i] != 0 && lastZeroIndex != -1){
                nums[lastZeroIndex] = nums[i];
                nums[i] = 0;
                lastZeroIndex++;
                
            }

        }
    }
}