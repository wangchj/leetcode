import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SearchInsertPositionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      SearchInsertPosition pos = new SearchInsertPosition();
      int result = pos.searchInsert(new int[] {1,3,5,6}, 2);
      Assert.assertEquals(1, result);
      
      result = pos.searchInsert(new int[] {1,3,5,6}, 5);
      Assert.assertEquals(2, result);
      
      result = pos.searchInsert(new int[] {3,5,7,9,10}, 8);
      Assert.assertEquals(3, result);
   }
}
