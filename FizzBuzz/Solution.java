import java.util.*;
class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>();
        if(n == 0)
            return answer;
        for(int i=1; i<=n; ++i){
            if(i % 3 == 0 && i % 5 == 0)
                answer.add("FizzBuzz");
            else if(i % 3 == 0)
                answer.add("Fizz");
            else if(i % 5 == 0)
                answer.add("Buzz");
            else
                answer.add(Integer.toString(i));
            
        }
        
        return answer;
    }
}