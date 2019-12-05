import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MergeSortedArrayTest
{
    @Test public void defaultTest()
    {
        int[] a = {0};
        int m = 0;
        int[] b = {1};
        int n = 1;
        
        MergeSortedArray sol = new MergeSortedArray();
        sol.merge(a, m, b, n);
    }
}
