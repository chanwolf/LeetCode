import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {	
    	char[] sToArray = s.toCharArray();
    	char[] tToArray = t.toCharArray();
    	Arrays.sort(sToArray);
    	Arrays.sort(tToArray);
        String orderedS = new String(sToArray);
        String orderdT = new String(tToArray);
        
    	return orderedS.equals(orderdT);
        
    }
}