package learn.basic.leetcode150;

public class StockBuySell {
    public int maxProfit(int[] prices) {  // find a better solution as this one is O(n^2)
        int maximumProfit = 0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if ((prices[j]-prices[i])>maximumProfit){
                    maximumProfit=prices[j]-prices[i];
                }
            }

        }
        return maximumProfit;

    }
}
