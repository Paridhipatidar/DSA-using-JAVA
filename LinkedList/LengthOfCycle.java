/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LengthOfCycle {
    public int hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
              int length=0;
              do{
                temp=temp.next;
                length++;
            }while(temp!=slow);
              return length;
        }
        return 0;
    }
}
