import java.lang.*;

class Solution {
    public int reverse(int x) {
        
        int sign = (x < 0?-1: 1);
        x = Math.abs(x);
        Long reverseInteger = 0L;
        int tempX = x;
        
        while(tempX > 0){
            reverseInteger = (reverseInteger*10) + tempX %10;
            tempX /= 10;
        }
        if(reverseInteger*sign > Integer.MAX_VALUE || reverseInteger*sign < Integer.MIN_VALUE){
            return 0;
        }
        return reverseInteger.intValue()*sign;
    }
}