/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *
 *         _______6______
 *        /              \
 *     ___2__          ___8__
 *    /      \        /      \
 *    0      _4       7       9
 *          /  \
 *          3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 *
 * @author Chih-Jye Wang
 * @since  2015-10-29
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;

public class LowestCommonAncestorBst {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<Integer, TreeNode> m = new HashMap<>();
        LinkedList<Integer> path1 = new LinkedList<>();
        LinkedList<Integer> path2 = new LinkedList<>();

        TreeNode n = root;
        path1.add(root.val);
        m.put(root.val, root);
        while(n != p) {
            if(n.val < p.val)
                n = n.right;
            else
                n = n.left;
            m.put(n.val, n);
            path1.add(n.val);
        }

        n = root;
        path2.add(root.val);
        while(n != q) {
            if(n.val < q.val)
                n = n.right;
            else
                n = n.left;
            path2.add(n.val);
        }

        Iterator<Integer> it = path1.descendingIterator();
        while(it.hasNext()) {
            int i = it.next();
            if(path2.contains(i))
                return m.get(i);
        }

        return null;
    }
}