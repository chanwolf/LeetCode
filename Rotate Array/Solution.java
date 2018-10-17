class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1)
            return;
        if(k > nums.length)
            k = k%nums.length;
        
        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; ++i){
        	if(i+k >= nums.length){
        		answer[(i+k) - nums.length] = nums[i];
        	}else{
        		answer[i+k] = nums[i];
        	}
        }
        for(int i=0; i<answer.length; ++i){
            nums[i] = answer[i];
        }

    }
}