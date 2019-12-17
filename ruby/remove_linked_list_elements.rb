# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @param {Integer} val
# @return {ListNode}
def remove_elements(head, val)
    return if !head
    i, p = head, nil
    while i
        if i.val == val
            if i === head
                i = head = head.next
            else
                p.next = i.next
                i = i.next
            end
        else
            p = i
            i = i.next
        end
    end
    return head
end
