import java.util.*;
class MinStack {
    private int min;
    private Stack<Integer> minStack;
    private Stack<Integer> previousMin;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Integer>();
        previousMin = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x<=min){
            previousMin.push(min);
            min = x;
        }
        minStack.push(x);
        
    }
    
    public void pop() {
        int toPop;
        if(!minStack.empty()){
            toPop = minStack.pop();
            if(toPop == min)
                min = previousMin.pop();
        }
    }
    
    public int top() {
        
        return minStack.peek();
    }   
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */