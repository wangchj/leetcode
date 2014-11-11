/**
 * Author: Chih-Jye Wang
 * Date  : Nov 11, 2014
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
public class SortColors_OnePass
{
    static final int R = 0;
    static final int W = 1;
    static final int B = 2;
    
    private int r = 0;
    private int w = 0;
    private int b = 0;
    
    public void sortColors(int[] A)
    {
        for(int i = 0; i < A.length; i++)
        {
            boolean again = sort(A, i);
            if(again) sort(A, i);
        }
    }
    
    /**
     * Checks if element element i is in the right place.
     * @param a the array
     * @param i an index of the array
     * @returns true if a[i] is at the right place, false otherwise.
     */
    private boolean rightPlace(int[] a, int i)
    {
        if(a[i] == R && i != r) return false;
        if(a[i] == W && i != w) return false;
        if(a[i] == B && i != b) return false;
        return true;
    }
    
    /**
     * Puts element i at the next position for its color.
     */
    private boolean sort(int[] a, int i)
    {
        boolean again = false;
        
        switch(a[i])
        {
            case R:
                if(r >= a.length)
                    break;
                
                if(!rightPlace(a, i))
                    swap(a, i, r);
                if(a[i] != a[r])
                    again = true;
                r++;
                if(w < r) w = r;
                if(b < r) b = r;
                break;
            case W:
                if(w >= a.length)
                    break;
                    
                if(!rightPlace(a, i))
                    swap(a, i, w);
                if(a[i] != a[w])
                    again = true;
                w++;
                if(b < w) b = w;
                break;
            case B:
                if(b >= a.length)
                    break;
                    
                if(!rightPlace(a, i))
                    swap(a, i, b);
                if(a[i] != a[b])
                    again = true;
                b++;
        }
        return again;
    }
    
    /**
     * Swaps the values of a[i] and a[j] in place.
     */
    public void swap(int[] a, int i, int j)
    {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}