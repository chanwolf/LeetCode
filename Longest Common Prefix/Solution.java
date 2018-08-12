class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer;
        if(strs.length > 0)
            answer = strs[0];
        else
            return "";
        
        int counter = 0;
        for(int i=1; i<strs.length; ++i){
        	while(counter < answer.length() && counter < strs[i].length()){
        		if(answer.charAt(counter) == strs[i].charAt(counter)){
        			++counter;
        		}else
        			break;
        	}
        	answer = answer.substring(0, counter);
        	counter = 0;

        }
        return answer;
    }
}