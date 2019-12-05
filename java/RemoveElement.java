/**
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement
{
    public int removeElement(int[] A, int elem)
    {
        //Keep track of new length
        int len = A.length;
        
        for(int i = A.length - 1; i >= 0; i--)
        {
            //If we found the element, we start array shifting
            if(A[i] == elem)
            {
                //If it is the end of original array, don't shift.
                if(i != A.length - 1)
                    System.arraycopy(A, i + 1, A, i, len - 1 - i);
                len--;
            }
        }
        return len;
    }
    
    public static void main(String[] args)
    {
        RemoveElement sol = new RemoveElement();
        int[] A = {1,2,3,4};
        int   c = sol.removeElement(A, 3);
        //int[] a = {1, 2, 3, 4};
        //System.arraycopy(a, 2, a, 1, 2);
    }
}