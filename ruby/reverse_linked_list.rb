# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @return {ListNode}
def reverse_list(head)
    res = nil
    while head
        node = head
        head = head.next
        if res
            node.next = res
            res = node
        else
            node.next = nil
            res = node
        end
    end
    return res
end
