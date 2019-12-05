/**
 * Author: Chih-Jye Wang
 * Date  : Jan 15, 2013
 *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 *
 * Solution: O(m + n) space.
 */

public class SetMatrixZeroes
{
    public void setZeroes(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(matrix[r][c] == 0)
                {
                    row[r] = true;
                    col[c] = true;
                }
            }
        }
        
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
            {
                if(row[r] || col[c])
                    matrix[r][c] = 0;
            }
        }
    }
}