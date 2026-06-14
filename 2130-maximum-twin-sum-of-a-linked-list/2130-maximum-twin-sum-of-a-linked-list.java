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
    public int pairSum(ListNode head) {
        int maxSum=0;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode revHalf=reverse(slow);
        ListNode firHalf=head;
        while(revHalf!=null){
            maxSum=Math.max(maxSum,firHalf.val + revHalf.val);
            firHalf=firHalf.next;
            revHalf=revHalf.next;
        }
        return maxSum;
    }
    private ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode pre=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        return pre;
    }
}