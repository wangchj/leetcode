/**
 * Author: Chih-Jye Wang
 * Date  : Dec 23, 2013
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * For example:
 * A = [2,3,1,1,4], return true.
 *
 * A = [3,2,1,0,4], return false.
 */
public class JumpGame
{
    public boolean canJump(int[] A)
    {
        int index = 0;
        while(index < A.length)
        {
            if(index >= A.length - 1)
                return true;
            if(A[index] == 0 && index < A.length - 1)
                return false;
            index += A[index];
        }
        return true;
    }
}