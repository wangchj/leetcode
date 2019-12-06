# Definition for a binary tree node.
class TreeNode
    attr_accessor :val, :left, :right
    def initialize(val)
        @val = val
        @left, @right = nil, nil
    end
end

# @param {TreeNode} root
# @return {Boolean}
def is_symmetric(root)
    return true if !root
    reverse(root.right)
    return is_same_tree(root.left, root.right)
end

# Recursively flips the left and right sides of a binary tree
def reverse(root)
    return if !root
    reverse(root.left)
    reverse(root.right)
    temp = root.left
    root.left = root.right
    root.right = temp
end

def is_same_tree(p, q)
    return true if !p && !q
    return false if (!p && q) || (p && !q) || p.val != q.val
    return is_same_tree(p.left, q.left) && is_same_tree(p.right, q.right)
end
