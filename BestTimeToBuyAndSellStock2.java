/**
 * Author: Chih-Jye Wang
 * Date  : Dec 21, 2013
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * Solution: Linear scan. When the price of day i is less than day i - 1, sell.
 */
public class BestTimeToBuyAndSellStock2
{   
    public int maxProfit(int[] prices)
    {
        if(prices == null || prices.length == 0)
            return 0;
        int sum = 0;
        int start = 0;
        int i;
        for(i = 1; i < prices.length; i++)
        {
            if(prices[i] < prices[i - 1])
            {
                sum += prices[i - 1] - prices[start];
                start = i;
            }
        }
        sum += prices[i - 1] - prices[start];
        return sum;    
    }
}