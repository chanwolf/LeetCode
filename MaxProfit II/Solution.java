class Solution {
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int nextDayProfit = 0;
    	for(int i=0; i<prices.length-1; ++i){
            if(prices[i] < buyPrice){
    			buyPrice = prices[i];
    		}
    		profit = prices[i] - buyPrice;
            nextDayProfit = prices[i+1] - buyPrice;
            
    		

    		if(profit > 0 && profit > nextDayProfit){
    			maxProfit+= profit;
    			buyPrice = Integer.MAX_VALUE;
    		}

    	}
        // Take care of last case if the most profitable day is at the end
        if(nextDayProfit >= profit)
            maxProfit += nextDayProfit;
        
    	return maxProfit;
        
    }
}