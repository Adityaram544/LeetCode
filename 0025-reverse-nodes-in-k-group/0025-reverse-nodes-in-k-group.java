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
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int x=cnt/k;
        while(x-->0){
            ListNode newHead=reverse(temp,k);
            prev.next=newHead;
            prev=temp;
            temp=temp.next;
        }
        return dummy.next;
    }
    private static ListNode reverse(ListNode head,int k){
        ListNode temp=head;
        ListNode prev=null;
        while(k-->0){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        head.next=temp;
        return prev;
    }
}