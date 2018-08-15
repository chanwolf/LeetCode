import java.util.*;

class Solution {
    public static int[] plusOne(int[] digits) {
    	if(digits.length <= 0 || digits ==null)
    		return new int[0];
        int index =digits.length-1;
        if(digits[index]+1 != 10){
        	++digits[index];
        	return digits;
        }
    
        boolean carryOver = false;
        while(true){
            if(digits[index] + 1 == 10){
                digits[index] = 0;
                carryOver = true;
            }else if(carryOver){
                ++digits[index];
                return digits;
            }
        	--index;
            
            
            
            
        	if(index < 0){
        		int[] answer = new int[digits.length+1];
        		++answer[0];
        		System.arraycopy(answer, 1, digits,0,digits.length);
        		return answer;
        	}
        }

    }


}