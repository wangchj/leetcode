/**
 * Definition for singly-lined list.
 */
public class ListNode
{
    int val;
    ListNode next;
    
    ListNode(int x)
    {
        val = x;
        next = null;
    }
   
    ListNode(int[] a)
    {
        val = a[0];
        
        ListNode n = this;
        for(int i = 1; i < a.length; i++)
        {
            n.next = new ListNode(a[i]);
            n = n.next;
        }  
    }
}