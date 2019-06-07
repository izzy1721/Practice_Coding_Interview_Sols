public ListNode reverseList(ListNode head) {
        /*
        * purpose of problem is to reverse the pointers of the list 
        *   ie 1->2->3->4->5 goes to 1<-2<-3<-4<-5
        * return old tail as new head
        * Time complexity:
        *   this takes O(n) time as we iterate though the whole list 
        */ 
        ListNode curr = head;
        ListNode prev = null;
        ListNode succ = null; 
        
        //go through the list and reverse the pointers by pointing 
        //curr to prev till curr is nullptr
        while (curr != null) 
        {
            succ = curr.next; //keep track of next node since we are reversing pointers
            curr.next = prev; //reverse pointer
            prev = curr; //update prev
            curr = succ; //update curr
        }
        //prev is the old tail so return it as new head
        return prev; 
        
    }
