import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RemoveDuplicatesFromSortedListTest
{
   /** A test that always fails. **/
    @Test public void defaultTest()
    {
        ListNode node = new ListNode(1);
        RemoveDuplicatesFromSortedList s = new RemoveDuplicatesFromSortedList();
        ListNode r = s.deleteDuplicates(node);
        Assert.assertEquals(node.val, r.val);
    }
}
