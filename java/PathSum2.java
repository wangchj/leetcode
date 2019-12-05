/**
 * Author: Chih-Jye Wang
 * Date  : Jan 18,2014
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
 
import java.util.ArrayList;

public class PathSum2
{
    public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return result;
        ArrayList<Integer> path = new ArrayList<Integer>();
        pathSum(root, sum, path, result);
        return result;
    }
    
    public static void pathSum(TreeNode root, int sum, ArrayList<Integer> path,
        ArrayList<ArrayList<Integer>> result)
    {
        path.add(root.val);
        
        if(root.left == null && root.right == null && sum == root.val)
            result.add(path);
            
        if(root.left != null)
            pathSum(root.left, sum - root.val, new ArrayList<Integer>(path), result);
        if(root.right != null)
            pathSum(root.right, sum - root.val, new ArrayList<Integer>(path), result);    
    }
}