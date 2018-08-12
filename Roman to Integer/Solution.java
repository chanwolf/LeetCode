import java.util.*;
class Solution {
    public int romanToInt(String s) {
    	HashMap<Character,Integer> romanNumerals = new HashMap<Character, Integer>();
    	romanNumerals.put('I',1);
    	romanNumerals.put('V',5);
    	romanNumerals.put('X',10);
    	romanNumerals.put('L',50);
    	romanNumerals.put('C',100);
    	romanNumerals.put('D',500);
    	romanNumerals.put('M',1000);
    	int answer = 0;
    	int currentNum = 0;
        for(int i=0; i<s.length(); ++i){
        	if(i+1 >= s.length()){
        		answer += romanNumerals.get(s.charAt(i));
        		return answer;
        	}
        	if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
        		answer += (romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i)));
                ++i;
        	}else
        		answer += romanNumerals.get(s.charAt(i));


        }
        return answer;
    }
}