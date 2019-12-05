/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 5, 2013
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree
{
   /**
    * Entry method
    */
   public boolean isSymmetric(TreeNode root)
   {
      if(root == null)
         return true;
      return isMirror(root.left, root.right);
   }
   
   /**
    * Test if left and right are mirror of each other.
    */
   public static boolean isMirror(TreeNode left, TreeNode right)
   {
      if(left == null && right == null)
         return true;
      if((left == null && right != null) || (left != null && right == null) ||
         (left.val != right.val))
         return false;
      return isMirror(left.right, right.left) && isMirror(left.left, right.right);   
   }
}

class TreeNode
{
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x){val = x;}
}