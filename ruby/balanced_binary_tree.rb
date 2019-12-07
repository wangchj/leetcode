# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Boolean}
def is_balanced(root)
    return check(root)[0]
end

def check(root)
    return [true, 0] if !root
    l = check(root.left)
    r = check(root.right)
    b = (l[1] - r[1]).abs <= 1
    return [l[0] && r[0] && b, [l[1], r[1]].max + 1]
end