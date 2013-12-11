import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AddTwoNumbersTest {


    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }


    /** A test that always fails. **/
    @Test public void nodeToLong()
    {
        ListNode l1 = new ListNode(new int[] {1,2,3}); 
        Assert.assertEquals(321, AddTwoNumbers.nodeToLong(l1));
        l1 = new ListNode(new int[] {0}); 
        Assert.assertEquals(0, AddTwoNumbers.nodeToLong(l1));
    }
    
    @Test public void longToNode()
    {
        ListNode n = AddTwoNumbers.longToNode(123);
        Assert.assertEquals(3, n.val);
        Assert.assertEquals(2, n.next.val);
        Assert.assertEquals(1, n.next.next.val);
    }
    
    @Test public void addTwoNumbers()
    {
        
        ListNode l1 = new ListNode(new int[] {1,2,3});
        ListNode l2 = new ListNode(new int[] {1,2,3});
        ListNode r  = AddTwoNumbers.addTwoNumbers(l1, l2);
        Assert.assertEquals(2, r.val);
        Assert.assertEquals(4, r.next.val);
        Assert.assertEquals(6, r.next.next.val);
        
        l1 = new ListNode(9);
        l2 = new ListNode(new int[] {1,9,9,9,9,9,9,9,9,9});
        r  = AddTwoNumbers.addTwoNumbers(l1, l2);
        
    }
}
