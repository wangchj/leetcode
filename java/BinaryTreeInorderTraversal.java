/**
 * Author: Chih-Jye Wang
 * Date  : Dec 16, 2013
 *
 *  Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
  
import java.util.ArrayList;

public class BinaryTreeInorderTraversal
{
    public ArrayList<Integer> inorderTraversal(TreeNode root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        inorderTraversal(root, result);
        return result;
    }
    
    void inorderTraversal(TreeNode root, ArrayList<Integer> result)
    {
        if(root == null)
            return;
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}