/**
 * Author: Chih-Jye Wang
 * Date  : Jan 22, 2014
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 *
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * Solution: O(n)
 */
public class MaximumSubarray
{
    public int maxSubArray(int[] A)
    {
        int res = A[0];
        int sum = res;
        
        for(int i = 1; i < A.length; i++)
        {
            if(sum < 0 && A[i] > sum)
                sum = A[i];
            else
            {
                sum += A[i];
            }
            
            if(sum > res)
                res = sum;
        }
        return res;
    }
}