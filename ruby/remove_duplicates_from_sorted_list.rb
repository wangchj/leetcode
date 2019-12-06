# Definition for singly-linked list.
class ListNode
    attr_accessor :val, :next
    def initialize(val)
        @val = val
        @next = nil
    end
end

# @param {ListNode} head
# @return {ListNode}
def delete_duplicates(head)
    i = head
    while i
        break if !i.next
        while i.next && i.next.val == i.val
            i.next = i.next.next
        end
        i = i.next
    end
    return head
end
