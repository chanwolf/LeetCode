class Solution {
    public int strStr(String haystack, String needle) {
		if(needle.length() <= 0)
			return 0;    	
		int currIndex =0;

    	for(int i=0; i < haystack.length(); ++i){
    		for(int j=0; j < needle.length(); ++j){
    			if(i+j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j)){
    				++currIndex;
    				if(currIndex == needle.length()){
    					return i;
    				}
    			}else{
    				break;
    			}
    		}

			currIndex = 0;
    		
    	}
    	return -1;
        
    }
}


