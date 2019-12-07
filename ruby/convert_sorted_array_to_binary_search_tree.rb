# Definition for a binary tree node.
class TreeNode
    attr_accessor :val, :left, :right
    def initialize(val)
        @val = val
        @left, @right = nil, nil
    end
end

# @param {Integer[]} nums
# @return {TreeNode}
def sorted_array_to_bst(nums)
    return if !nums || nums.length == 0
    return bst(nums, 0, nums.length - 1)
end

def bst(nums, i, j)
    return if i > j
    mid = (j - i) / 2 + i
    node = TreeNode.new(nums[mid])
    node.left = bst(nums, i, mid - 1)
    node.right = bst(nums, mid + 1, j)
    return node
end