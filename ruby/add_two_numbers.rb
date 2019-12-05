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
def add_two_numbers(l1, l2)
    head = tail = nil
    carry = 0
    while l1 || l2
        sum = l1.val + carry if l1 && !l2
        sum = l2.val + carry if l2 && !l1
        sum = l1.val + l2.val + carry if l1 && l2
        val = sum % 10
        carry = sum / 10
        node = ListNode.new(val)
        if head == nil
            head = tail = node
        else
            tail.next = node
            tail = node
        end
        l1 = l1.next if l1
        l2 = l2.next if l2
    end
    tail.next = ListNode.new(carry) if carry != 0
    return head
end

l1n1 = ListNode.new(2)
l1n2 = ListNode.new(4)
l1n3 = ListNode.new(3)
l1n1.next = l1n2
l1n2.next = l1n3
l2n1 = ListNode.new(5)
l2n2 = ListNode.new(6)
l2n3 = ListNode.new(4)
l2n1.next = l2n2
l2n2.next = l2n3
p add_two_numbers(l1n1, l2n1)
