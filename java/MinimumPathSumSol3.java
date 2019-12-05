/**
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSumSol3
{
    public int minPathSum(int[][] grid)
    {
        int[][] cost = new int[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(i == 0 && j == 0)
                    cost[i][j] = grid[i][j];
                else if(i == 0)
                    cost[i][j] = grid[i][j] + cost[i][j - 1];
                else if(j == 0)
                    cost[i][j] = grid[i][j] + cost[i - 1][j];
                else
                    cost[i][j] = grid[i][j] + Math.min(cost[i - 1][j], cost[i][j - 1]);             
            }
        }
        return cost[grid.length - 1][grid[0].length - 1];
    }
}