/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null) return true;

    // Step 1: find middle
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    // Step 2: reverse second half
    ListNode second = reverse(slow.next);
    ListNode first = head;

    // Step 3: compare
    while (second != null) {
        if (first.val != second.val) return false;
        first = first.next;
        second = second.next;
    }
       return true;
    }

     ListNode reverse(ListNode head) {
        ListNode pres=head;
        ListNode next=pres.next;
        ListNode prev=null;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null ) next=next.next;
        } 
        return prev; 
    }
}
