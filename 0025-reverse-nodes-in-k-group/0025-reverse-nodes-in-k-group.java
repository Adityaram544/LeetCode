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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int x=cnt/k;
        temp=head;
        while(x-->0){
            ListNode newHead=reverse(temp,k);
            pre.next=newHead;
            pre=temp;
            temp=temp.next;
        }
        return dummy.next;
    }
    private ListNode reverse(ListNode head,int k){
        ListNode temp=head;
        ListNode pre=null;
        while(k-->0){
            ListNode next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        head.next=temp;
        return pre;
    }
}