class Solution {
    public int firstUniqChar(String s) {
        char currChar;
        for(int i=0; i<s.length(); ++i){
            currChar = s.charAt(i);
            if(s.indexOf(currChar) == i && s.lastIndexOf(currChar) == i)
                return i;
        }
        return -1;
        
    }
}