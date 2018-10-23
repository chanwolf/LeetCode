class Solution {
    public int maxProfit(int[] prices) {
 		int maxProfit = 0;
 		int buyPoint = Integer.MAX_VALUE;
 		for(int i=0; i<prices.length; ++i){
 			int profit = prices[i] - buyPoint;
 			if(prices[i] < buyPoint){
 				buyPoint = prices[i];
 			}
 			if(profit > maxProfit){
 				maxProfit = profit;
 			}
 		}       
 		return maxProfit;
    }
}