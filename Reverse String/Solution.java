class Solution {
    public String reverseString(String s) {
        char[] reverse = s.toCharArray();
        
        for(int i=0; i<reverse.length/2; ++i){
            char temp = reverse[i];
            int upperHalf = reverse.length - i - 1;
            
            reverse[i] = reverse[upperHalf];
            reverse[upperHalf] = temp;
        }
        
        return String.valueOf(reverse);
    }
}