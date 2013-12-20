/**
 * Author: Chih-Jye Wang
 * Date  : Dec 20, 2013
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * How many possible unique paths are there?
 *
 * Strategy: Solve Pascal's Triangle.
 */
public class UniquePaths
{
    public int uniquePaths(int m, int n)
    {
        int[][] matrix = new int[m][n];
        for(int i = m - 1; i >= 0; i--)
            for(int j = n - 1; j >= 0; j--)
                if(i == m - 1 || j == n - 1)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = matrix[i + 1][j] + matrix[i][j + 1];
        return matrix[0][0];
    }
}