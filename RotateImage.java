/**
 * Author: Chih-Jye Wang
 * Date  : Dec 18, 2013
 *
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Example:
 *     [[1,2],[3,4]] -> [[3,1],[4,2]]
 *
 * Follow up:
 * Could you do this in-place?
 *
 * Solution: In-place algorithm. Rotate one ring at a time, starting from outer ring.
 */
public class RotateImage
{
    public void rotate(int[][] matrix)
    {
        //The width of the matrix
        int n = matrix.length;
        //i represent concentric rings of the matrix, 0 represent outer-most ring.
        for(int i = 0; i < n / 2; i++)
        {
            for(int j = 0; j < n - 2 * i - 1; j++)
            {
                //Save one of the elments of the ring before rotation.
                int temp = matrix[i][i + j];
                //Rot 1: West col -> North row
                matrix[i][i + j] = matrix[n - 1 - i - j][i];
                //Rot 2: South row -> West col
                matrix[n - 1 - i - j][i] = matrix[n - 1 - i][n - 1 - i - j];
                //Rot 3: East col -> South row
                matrix[n - 1 - i][n - 1 - i - j] = matrix[i + j][n - 1 - i];
                //Rot 4: North row -> East col
                matrix[i + j][n - 1 - i] = temp;
            }
        }
    }
}