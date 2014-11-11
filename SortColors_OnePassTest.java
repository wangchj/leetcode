import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SortColors_OnePassTest
{
    @Test public void testOneElement()
    {
        int[] a = {0};
        SortColors_OnePass sol = new SortColors_OnePass();
        sol.sortColors(a);
        Assert.assertEquals(0, a[0]);
    }
    
    @Test public void testSortedThreeElement()
    {
        int[] a = new int[] {0, 1, 2};
        SortColors_OnePass sol = new SortColors_OnePass();
        sol.sortColors(a);
        Assert.assertEquals(0, a[0]);
        Assert.assertEquals(1, a[1]);
        Assert.assertEquals(2, a[2]);
    }
    
    @Test public void testReversedThreeElement()
    {
        int[] a = new int[] {2,1,0};
        SortColors_OnePass sol = new SortColors_OnePass();
        sol.sortColors(a);
        Assert.assertEquals(0, a[0]);
        Assert.assertEquals(1, a[1]);
        Assert.assertEquals(2, a[2]);
    }
    
    @Test public void testRandomThreeElement()
    {
        int[] a = new int[] {1,0,2};
        SortColors_OnePass sol = new SortColors_OnePass();
        sol.sortColors(a);
        Assert.assertEquals(0, a[0]);
        Assert.assertEquals(1, a[1]);
        Assert.assertEquals(2, a[2]);
    }
    
    @Test public void testRandom()
    {
        int[] a = new int[] {1,0,2,1,0};
        SortColors_OnePass sol = new SortColors_OnePass();
        sol.sortColors(a);
        Assert.assertEquals(0, a[0]);
        Assert.assertEquals(0, a[1]);
        Assert.assertEquals(1, a[2]);
        Assert.assertEquals(1, a[3]);
        Assert.assertEquals(2, a[4]);
    }
}
