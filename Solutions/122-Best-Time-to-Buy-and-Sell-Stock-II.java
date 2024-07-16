/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
 */
class Solution122 {
    //Can be refactored to be more readable. I think the first if statement is redundant in this solution.
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int totalProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            }

            if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
                totalProfit += profit;
                buy = prices[i];
                profit = 0;
            }
        }

        return totalProfit;
    }
}