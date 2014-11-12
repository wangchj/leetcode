/**
 * Author: Chih-Jye Wang
 * Date  : Nov 12, 2014
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array.
 */
public class FindMinimumInRotatedSortedArray
{
    /**
     * Find min of rotated sorted array.
     */
    public int findMin(int[] num)
    {
        return findMin(num, 0, num.length - 1);
    }
    
    /**
     * Find min using binary search.
     * @param start start index of search
     * @param end   end index of search
     * @return the min value.
     */
    public int findMin(int[] num, int start, int end)
    {
        if(num.length == 1 || num[start] < num[end])
            return num[0];
        
        int mid = (start + end) / 2;
        
        if(mid != start && num[mid - 1] > num[mid])
            return num[mid];
        if(mid != end && num[mid + 1] < num[mid])
            return num[mid + 1];
        
        //See which part to do next binary search
        if(num[start] > num[mid - 1])
            return findMin(num, start, mid - 1);
        else
            return findMin(num, mid + 1, end);
    }
}