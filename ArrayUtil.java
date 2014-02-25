public class ArrayUtil
{
    /**
     * Swaps values the values in a[i] and a[j] inside array a (in place).
     * @param i the first index.
     * @param j the second index.
     * @throws IllegalArgumentException if a is null or i or j is not a valid index.
     */
    public static <T> void swap(T[] a, int i, int j)
    {
        if(i < 0 || j < 0 || a == null || i >= a.length || j >= a.length)
            throw new IllegalArgumentException();    
    }
}