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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode a=head;
        ListNode b=head.next;
        while(b!=null){
            int gcdV=gcd(a.val,b.val);
            ListNode node=new ListNode(gcdV);
            a.next=node;
            node.next=b;
            a=b;
            b=b.next;
        }

        return head;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}