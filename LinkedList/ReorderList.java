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
class ReorderList{
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode start=head;
        ListNode mid=middleList(head);
        ListNode end=reverseList(mid);
        while(start!=null&&end!=null){
            ListNode temp=start.next;
            start.next=end;
            start=temp;
            temp=end.next;
            end.next=start;
            end=temp;
        }
        if(start!=null){
            start.next=null;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode pres=head;
        ListNode next=pres.next;
        ListNode prev=null;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
            next=next.next;
        }
        return prev;
    }
    public ListNode middleList(ListNode head){
        ListNode slow=head , fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
