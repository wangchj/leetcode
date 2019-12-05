/**
 * Author: Chih-Jye Wang
 * Date  : Jan 22, 2014
 *
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 *
 * Would this affect the run-time complexity? How and why?
 *
 * Write a function to determine if a given target is in the array.
 *
 * Solution: Same algorithm and run-time complexity as Search In Rotated Sorted Array 1.
 */

import java.util.Arrays;

public class SearchInRotatedSortedArray2
{
    public boolean search(int[] A, int target)
    {
        if(A == null || A.length == 0)
            return false;
        
        int cut = SearchInRotatedSortedArray.searchPivot(A);
        
        //If cut is -1 that means the array is not rotated. Just perform normal binary search
        if(cut == -1)
            return Arrays.binarySearch(A, target) >= 0;
        
        //Perform binary search on the portions of the array before and after the cut
        //binarySearch(A, start inclusive, end exclusive, target)
        return Arrays.binarySearch(A, 0, cut, target) >= 0 ||
               Arrays.binarySearch(A, cut, A.length, target) >= 0;
    }
}