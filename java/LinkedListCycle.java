/**
 * Author: Chih-Jye Wang
 * 
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle
{
   public boolean hasCycle(ListNode head)
   {
      // IMPORTANT: Please reset any member data you declared, as
      // the same Solution instance will be reused for each test case.
        
      if(head == null)
          return false;
        
      java.util.HashSet<ListNode> visited = new java.util.HashSet<ListNode>();
      
      for(ListNode current = head;
          current != null; current = current.next)
      {
          if(visited.contains(current))
              return true;
          visited.add(current);
      }
        
      return false;
   }
}

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
      val = x;
      next = null;
   }
}