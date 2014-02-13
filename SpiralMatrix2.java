/**
 * Author: Chih-Jye Wang
 * Date  : Feb 12, 2014
 *
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * For example,
 * Given n = 3,
 *
 * You should return the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class SpiralMatrix2
{
    final static int head_r = 0;   //Heading Right
    final static int head_d = 1;   //Heading Down
    final static int head_l = 2;   //Heading Right
    final static int head_u = 3;   //Heading Up
   
    public static int[][] generateMatrix(int n)
    {
        int head = head_r;
        int stop = (int)Math.pow(n, 2);
        int[][] m = new int[n][n];
        int row = 0, col = 0;

        for(int i = 0; i < stop; i++)
        {
           m[row][col] = i + 1;
           if(atEdge(m, head, row, col))
              head = (head + 1) % 4;
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
        return m;
    }
   
    /**
     * Determine if current location (row, col) can advance no longer.
     */
    static boolean atEdge(int[][] m, int head, int row, int col)
    {
        int n = m.length;

        switch(head)
        {
           case head_r:
              return (col == n -1) || (m[row][col + 1] != 0);
           case head_d:
              return (row == n -1) || (m[row + 1][col] != 0);
           case head_l:
              return (col == 0) || (m[row][col - 1] != 0);
           case head_u:
              return (row == 0) || (m[row - 1][col] != 0);
        }
        return true;
    }
   
    public static void main(String[] args)
    {
       int[][] m = generateMatrix(3);
    }
}