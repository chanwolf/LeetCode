class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int reverseInteger = 0;
        int tempX = x;
        //example x = 121
        while(tempX > 0){
        	reverseInteger = (reverseInteger*10) + tempX %10;
        	tempX /= 10;
        }

        return (reverseInteger==x ? true: false);
    }
}