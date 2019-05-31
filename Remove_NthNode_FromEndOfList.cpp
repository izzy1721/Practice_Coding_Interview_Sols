/*
Given a linked list, remove the n-th node from the end of list and return its head.

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
*/

ListNode* removeNthFromEnd(ListNode* head, int n) {
        //empty list
        if (head == nullptr) {
            return nullptr; 
        }
        //get size of list
        int size = 0; 
        ListNode * getSize = head; 
        while (getSize != nullptr) {
            size++;
            getSize = getSize->next; 
        }
        //error check n 
        if (n > size) {
            return nullptr; 
        }
        //first node case
        if (n == size) {
            ListNode* deleteThis = head;
            head = head->next;
            delete deleteThis; 
            return head;
        }
        //middle and end case 
        ListNode* temp = head; 
        int dist = size; 
        while (temp->next != nullptr) {
            if (dist == n+1) {
                ListNode* deleteThis = temp->next;
                temp->next = deleteThis->next;
                delete deleteThis; 
                break; 
            }
            dist--;
            temp = temp->next; 
        }
        return head; 
    }
