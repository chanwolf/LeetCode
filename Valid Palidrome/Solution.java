class Solution {
    public static boolean isPalindrome(String s) {
    	if(s.length() <= 0 )
    		return true;


    	String parsedS = s.replaceAll("[^A-Za-z]", "").toLowerCase();
    	System.out.println("Stripped version: " + parsedS);

    	for(int i=0; i<parsedS.length()/2; ++i){
    		int endHalf = parsedS.length()-i-1;
    		System.out.println(i + " -> " + endHalf);

    		if(parsedS.charAt(i) != parsedS.charAt(endHalf)){
    			return false;
    		}
    	}
    	return true;
        
    }

    static public void main(String[] s){
    	String pala = "A man, a plan, a canal: Panama";
    	System.out.println(Solution.isPalindrome(pala));

    }
}