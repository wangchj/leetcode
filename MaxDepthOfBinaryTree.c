/**
 * Author: Chih-Jye Wang
 * Date  : Oct 8, 2015
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
 
struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int maxDepth(struct TreeNode* root) {
    if(!root)
        return 0;
    int a = maxDepth(root->left);
    int b = maxDepth(root->right);
    if(a > b)
        return a + 1;
    else
        return b + 1;
}