/**
 * Author: Chih-Jye Wang
 * Date  : Feb 12, 2014
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * For example,
 * Given the following matrix:
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 *
 * You should return [1,2,3,6,9,8,7,4,5].
 */

import java.util.ArrayList;

public class SpiralMatrix
{
    final static int head_r = 0;   //Heading Right
    final static int head_d = 1;   //Heading Down
    final static int head_l = 2;   //Heading Right
    final static int head_u = 3;   //Heading Up
   
    public ArrayList<Integer> spiralOrder(int[][] matrix)
    {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<Integer>();
            
        int head = head_r;
        int stop = matrix.length * matrix[0].length;
        ArrayList<Integer> r = new ArrayList<Integer>(stop);
        int row = 0, col = 0;

        for(int i = 0; i < stop; i++)
        {
            r.add(matrix[row][col]);//Add content to result
            matrix[row][col] = 0;   //Mark the current cell as visited with 0
            if(atEdge(matrix, head, row, col))
                head = (head + 1) % 4;  //Change heading
            switch(head)
            {
                case head_r:
                    col++; break;
                case head_d:
                    row++; break;
                case head_l:
                    col--; break;
                case head_u:
                    row--; break;
            }
        }
        return r;
    }
   
    /**
     * Determine if current location (row, col) can advance no longer.
     */
    static boolean atEdge(int[][] matrix, int head, int row, int col)
    {
        int m = matrix.length;      //Number of rows
        int n = matrix[0].length;   //Number of cols
        
        switch(head)
        {
            case head_r:
                return (col == n - 1) || (matrix[row][col + 1] == 0);
            case head_d:
                return (row == m - 1) || (matrix[row + 1][col] == 0);
            case head_l:
                return (col == 0) || (matrix[row][col - 1] == 0);
            case head_u:
                return (row == 0) || (matrix[row - 1][col] == 0);
        }
        return true;
    }
}