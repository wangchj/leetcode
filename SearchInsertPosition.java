/**
 * Author:  Chih-Jye Wang
 * Date:    Nov 22, 2013
 * 
 * Search Insert Position:
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class SearchInsertPosition
{
   public int searchInsert(int[] A, int target)
   {
      return binarySearch(A, target, 0, A.length-1);
   }
   
   public int binarySearch(int[] a, int target, int start, int end)
   {
      if(start == end)
      {
         if(target <= a[start])
            return start;
         else
            return start + 1;   
      }
      
      int mid = (end - start) / 2 + start;
      
      if(a[mid] == target)
         return mid;
      else if(target < a[mid])
      {
         if(mid == start) return mid;
         else return binarySearch(a, target, start, mid - 1);
      }
      else
      {
         return binarySearch(a, target, mid + 1, end);
      }
   }
}