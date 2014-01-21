/**
 * Author: Chih-Jye Wang
 * Date  : Jan 20, 2014
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 */
 
import java.util.Arrays;

public class SearchInRotatedSortedArray
{
    public static int search(int[] A, int target) {
        if(A == null || A.length == 0)
            return -1;
        
        int cut = searchPivot(A);
        
        //If cut == -1, then there is not cut -> array is sorted.
        //Just perform binary search.
        if(cut == -1)
        {
            int search = Arrays.binarySearch(A, target);
            if(search < 0)
                return -1;
            else
                return search;
        }
        
        //Perform binary search on the portion of the array before the cut
        //binarySearch(A, start inclusive, end exclusive, target)
        int search = Arrays.binarySearch(A, 0, cut, target); 
        //If found just return
        if(search >= 0)
            return search;
        
        //Search again on the portion after cut.
        search = Arrays.binarySearch(A, cut, A.length, target);
        if(search >= 0)
            return search;
        return -1;
    }
    
    /**
     * Gets the index of the first out of order (non-ascending) element.
     * @return -1 if not found.
     */
    static int searchPivot(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(i == 0)
                continue;
            if(a[i] < a[i -1])
                return i;
        }
        return -1;
    }
}