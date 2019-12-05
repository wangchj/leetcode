/**
 * Author: Chih-Jye Wang
 * Date  : Dec 17, 2013
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedArrayToBinarySearchTree
{
    public TreeNode sortedArrayToBST(int[] num)
    {
        return sortedArrayToBST(num, 0, num.length - 1);
    }
    
    TreeNode sortedArrayToBST(int[] a, int start, int end)
    {
        if(end < start || start > end)
            return null;
        if(start == end)
            return new TreeNode(a[start]);
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(a[mid]);
        node.left  = sortedArrayToBST(a, start, mid - 1);
        node.right = sortedArrayToBST(a, mid + 1, end);
        return node;
    }
}