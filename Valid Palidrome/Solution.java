class Solution {
    public static boolean isPalindrome(String s) {
    	String parsedS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if(parsedS.length() <= 1)
            return true;
       

    	for(int i=0; i<parsedS.length()/2; ++i){
    		int endHalf = parsedS.length()-i-1;

    		if(parsedS.charAt(i) != parsedS.charAt(endHalf)){
    			return false;
    		}
    	}
    	return true;
        
    }
}