# Definition for singly-linked list.
class ListNode
    attr_accessor :val, :next
    def initialize(val)
        @val = val
        @next = nil
    end
end

# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}
def merge_two_lists(l1, l2)
    return nil if !l1 && !l2
    return l1 if !l2
    return l2 if !l1

    head = tail = nil

    while l1 && l2
        if l1.val < l2.val
            append = l1
            l1 = l1.next
        else
            append = l2
            l2 = l2.next
        end

        if head == nil
            head = tail = append
        else
            tail.next = append
            tail = append
        end
    end

    tail.next = l1 if l1
    tail.next = l2 if l2

    return head
end

l1n1 = ListNode.new(1)
l1n2 = ListNode.new(2)
l1n3 = ListNode.new(4)

l1n1.next = l1n2
l1n2.next = l1n3

l2n1 = ListNode.new(1)
l2n2 = ListNode.new(3)
l2n3 = ListNode.new(4)

l2n1.next = l2n2
l2n2.next = l2n3

p l1n1
p l2n1

p merge_two_lists(l1n1, l2n1)