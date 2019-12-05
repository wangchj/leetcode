/*
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 *
 * Note:
 * You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
 *
 * Strategy:
 * 1. Find the element A[a] such that A[a] > B[start]
 * 2. Find the range of elements in B that are less than A[a]
 * 3. Expand A and copy range into A
 * 4. Repeat
 * Note, elements of equal value, elements in B are insert after elemnts in A
 */
public class MergeSortedArray
{
    public void merge(int A[], int m, int B[], int n)
    {
        //Index for array A
        int a = 0;
        //Length of A
        int lenA = m;
        //Index for array B: b_start, b_end
        int start = 0;
        int end = 0;
        
        while(a < lenA && start < n)
        {
            if(B[start] < A[a])
            {
                //Find the range [start, end] in B that are less than A[a]
                while(end <  n && B[end] < A[a])
                    end++;
                int width = end - start;    
                //Shift A to make room for range from B
                shift(A, lenA, a, width);
                //Copy content of B to A
                System.arraycopy(B, start, A, a, width);
                lenA += width;
                //Adjust pointers
                a += width + 1;
                start = end;
            }
            else
            {
                a++;
            }
        }
        
        if(start < n)
            System.arraycopy(B, start, A, a, n - start);
    }
    
    /**
     * Shifts array 'a' for 'w' positions to right staring at index 'start'
     */
    void shift(int[] a, int lenA, int start, int w)
    {
        System.arraycopy(a, start, a, start + w, lenA - start);
    }
}