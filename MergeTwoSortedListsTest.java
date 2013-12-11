import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListsTest
{
	@Test public void test1()
	{
		MergeTwoSortedLists p = new MergeTwoSortedLists();
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(new int[] {1,2,4});
		
		ListNode result = p.mergeTwoLists(l1, l2);
	}
	
	@Test public void test2()
	{
		
		ListNode l1 = new ListNode(new int[] {-9,-7,-3,-3,-1,2,3});
		ListNode l2 = new ListNode(new int[] {-7,-7,-6,-6,-5,-3,2,4});
		
		MergeTwoSortedLists p = new MergeTwoSortedLists();
		ListNode result = p.mergeTwoLists(l1, l2);
	}
}
