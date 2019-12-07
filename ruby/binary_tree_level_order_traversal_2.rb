# Definition for a binary tree node.
class TreeNode
    attr_accessor :val, :left, :right
    def initialize(val)
        @val = val
        @left, @right = nil, nil
    end
end

# @param {TreeNode} root
# @return {Integer[][]}
def level_order_bottom(root)
    @res = []
    traverse(root, 0)
    @res.reverse
end

def traverse(node, level)
    return if !node
    @res[level] = [] if !@res[level]
    @res[level] << node.val
    traverse(node.left, level + 1)
    traverse(node.right, level + 1)
end