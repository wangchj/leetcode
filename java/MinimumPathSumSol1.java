public class MinimumPathSumSol1
{
    public int minPathSum(int[][] grid)
    {
        return minPathSum(grid, 0, 0, 0);
    }
    
    public int minPathSum(int[][] grid, int x, int y, int sum)
    {
        sum += grid[x][y];
        if(x == grid.length - 1 && y == grid[0].length - 1)
            return sum;
        if(x == grid.length - 1)
            return minPathSum(grid, x, y + 1, sum);
        if(y == grid[0].length - 1)
            return minPathSum(grid, x + 1, y, sum);
        return Math.min(
            minPathSum(grid, x, y + 1, sum),
            minPathSum(grid, x + 1, y, sum)
        );
    }
}