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
class Solution {
    public void reorderList(ListNode head) {

        ListNode slow=head,fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode pre=null,next=null;
        while(slow!=null){
            next=slow.next;
            slow.next=pre;
            pre=slow;
            slow=next;
        }
        
        ListNode first=head;
        ListNode second=pre;
        while(second.next!=null){
            next=first.next;
            pre=second.next;
            first.next=second;
            second.next=next;
            first=next;
            second=pre;
        }
    }
}