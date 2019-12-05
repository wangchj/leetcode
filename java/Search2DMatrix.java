/**
 * Author: Chih-Jye Wang
 * Date  : Dec 20, 2013
 *
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 *  - Integers in each row are sorted from left to right.
 *  - The first integer of each row is greater than the last integer of the previous row.
 * 
 * For example,
 *
 * Consider the following matrix:
 * 
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 */
public class Search2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if(matrix == null || matrix.length == 0)
            return false;
        int r = getRowIndex(matrix, target);
        if(r == -1)
            return false;
        //Perform binary search on the elements of the row
        int[] row = matrix[r];
        int start = 0, end = row.length - 1;
        int mid;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if(row[mid] == target)
                return true;
            if(row[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;    
        }
        return false;
    }
    
    /**
     * Binary search the row that contains target.
     * @return -1 if row not found.
     */
    public int getRowIndex(int[][] matrix, int target)
    {
        int start = 0, end = matrix.length - 1;
        int mid;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target)
                return mid;
            if(matrix[mid][0] > target)
                end = mid - 1;
            else
                start = mid + 1;    
        }
        return -1;
    }
}