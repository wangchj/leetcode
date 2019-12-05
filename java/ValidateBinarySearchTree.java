/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 13, 2013
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 * 
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidateBinarySearchTree
{
    public boolean isValidBST(TreeNode root)
    {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);              
        //return isValidBST(root.left) && isValidBST(root.right);
    }
    
    public boolean isValidBST(TreeNode root, int min, int max)
    {
        if(root == null)
            return true;
        if(root.left != null && (root.left.val >= root.val || root.left.val <= min))
            return false;
        if(root.right != null && (root.right.val <= root.val || root.right.val >= max))
            return false;
        return isValidBST(root.left, min, root.val) &&
               isValidBST(root.right, root.val, max);
    }
}