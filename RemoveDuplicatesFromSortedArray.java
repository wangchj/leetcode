/**
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example,
 * Given input array A = [1,1,2],
 *
 * Your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] A)
    {
        if(A == null || A.length == 0)
            return 0;
        
        //The front of the array    
        int front = A.length - 1;
        //The rear of the array
        int rear  = A.length - 1;
        //Keep track of new length
        int len   = A.length;
        
        while(front >= 0)
        {
            if(A[front] == A[rear])
                front--;
            else if(rear - front <= 1)
                rear = front;
            else    
            {
                System.arraycopy(A, rear, A, front + 1, len - 1 - (rear - 1));
                len -= rear - front - 1;
                rear = front;
            }    
        }
        
        //Last group
        if(rear != 0)
        {
            System.arraycopy(A, rear, A, 0, len - 1 - (rear - 1));
            len -= rear;
        }
        return len;
    }
}