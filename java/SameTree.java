/**
 * Author: Chih-Jye Wang
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value. 
 *
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SameTree
{
   public boolean isSameTree(TreeNode p, TreeNode q)
   {
      // IMPORTANT: Please reset any member data you declared, as
      // the same Solution instance will be reused for each test case.
      
      if(p == null && q == null)
         return true;
      if((p == null && q != null) || (p != null && q == null))
         return false;
            
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val;  
  }
}

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}