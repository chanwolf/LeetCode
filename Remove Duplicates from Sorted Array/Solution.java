class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 0)
            return 0;
    	int tempNum = nums[0];
    	int count = 1;
    	for(int i= 1; i<nums.length; ++i){
    		if(tempNum != nums[i]){
    			nums[count++] = nums[i];
                tempNum = nums[i];
            }
    		
    	}
        return count;
    }
}