/**
 * Author: Chih-Jye Wang
 * Date  : Dec 17, 2013
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Reference: https://github.com/AnnieKim/LeetCode
 */
public class BestTimeToBuyAndSellStock
{
    public int maxProfit(int[] prices)
    {
        int minPrice = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minPrice)
                minPrice = prices[i];
            if(prices[i] - minPrice > max)
                max = prices[i] - minPrice;    
        }
        return max;
    }
}