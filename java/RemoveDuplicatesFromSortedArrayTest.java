import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RemoveDuplicatesFromSortedArrayTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void test() {
      RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();
      int[] a = {1,2,2,3,4};
      Assert.assertEquals(4, sol.removeDuplicates(a));
      Assert.assertEquals(1, a[0]);
      Assert.assertEquals(2, a[1]);
      Assert.assertEquals(3, a[2]);
      Assert.assertEquals(4, a[3]);
      
      a = new int[] {1,1,2,2,3,4};
      Assert.assertEquals(4, sol.removeDuplicates(a));
      Assert.assertEquals(1, a[0]);
      Assert.assertEquals(2, a[1]);
      Assert.assertEquals(3, a[2]);
      Assert.assertEquals(4, a[3]);
   }
}
