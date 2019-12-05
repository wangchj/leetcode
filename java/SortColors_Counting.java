/**
 * Author: Chih-Jye Wang
 * Date  : Nov 10, 2014
 *
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * 
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 * 
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * 
 * Could you come up with an one-pass algorithm using only constant space?
 */
public class SortColors_Counting
{
    static final int R = 0;
    static final int W = 1;
    static final int B = 2;
    
    private int rCount = 0;
    private int wCount = 0;
    private int bCount = 0;
    
    public void sortColors(int[] A) 
    {
        count(A);
        for(int i = 0; i < A.length; i++)
        {
            if(i < rCount)
                A[i] = R;
            else if(i < rCount + wCount)
                A[i] = W;
            else
                A[i] = B;
        }
    }
    
    public void count(int[] a)
    {
        for(int i : a)
        {
            switch(i)
            {
                case R:
                    rCount++;
                    break;
                case W:
                    wCount++;
                    break;
                case B:
                    bCount++;
                    break;
            }
        }
    }
}