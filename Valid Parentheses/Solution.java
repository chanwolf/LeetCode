import java.util.*;

class Solution {
    public boolean isValid(String s) {
    	if(s.length() == 0)
    		return true;
        else if(s.length() <= 1)
            return false;

   		Stack<Character> sk = new Stack<Character>();

        for(int i=0; i<s.length();++i){
        	if(s.charAt(i) == '('){
        		sk.push(s.charAt(i));
        	}else if(s.charAt(i) == ')'){
        		if(sk.empty() || sk.pop() != '(')
        			return false;
        	}

        	if(s.charAt(i) == '['){
        		sk.push(s.charAt(i));
        	}else if(s.charAt(i) == ']'){
        		if(sk.empty() || sk.pop() != '[')
        			return false;
        	}

        	if(s.charAt(i) == '{'){
        		sk.push(s.charAt(i));
        	}else if(s.charAt(i) == '}'){
        		if(sk.empty() || sk.pop() != '{')
        			return false;
        	}

        }
        return sk.empty();
    }

}