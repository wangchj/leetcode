/**
 * Author: Chih-Jye Wang
 * Date  : Oct 5, 2015
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
 
struct ListNode {
    int val;
    struct ListNode *next;
};

void deleteNode(struct ListNode* node) {
    struct ListNode* prev;
    while(node->next) {
        node->val = node->next->val;
        prev = node;
        node = node->next;
    }
    prev->next = 0;
}