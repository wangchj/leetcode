/**
 * Author: Chih-Jye Wang
 * Date  : Oct 11, 2015
 *
 * Reverse a singly linked list.
 *
 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
 
#include <cstddef>

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class ReverseLinkedList {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* r = NULL;
        ListNode* p = head;
        while(p) {
            ListNode* t = p;
            p = p->next;
            t->next = r;
            r = t;
        }
        return r;
    }
};