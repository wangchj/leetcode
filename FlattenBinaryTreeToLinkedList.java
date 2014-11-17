/**
 * Author: Chih-Jye Wang
 * Date  : Nov 16, 2014
 *
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example,
 * Given
 * 
 *          1
 *         / \
 *       2   5
 *       / \   \
 *      3   4   6
 * 
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 * click to show hints.
 * 
 * Hints:
 * If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
 */

public class FlattenBinaryTreeToLinkedList
{
    public void flatten(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))
            return;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left = null;
        
        flatten(left);
        flatten(right);
        
        if(left != null)
        {
            root.right = left;
            
            TreeNode n = left;
            while(n.right != null)
                n = n.right;
            
            n.right = right;
        }
    }
}