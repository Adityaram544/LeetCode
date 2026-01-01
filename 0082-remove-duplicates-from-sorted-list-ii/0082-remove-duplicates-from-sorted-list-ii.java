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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        while(temp!=null){
            ListNode front=temp.next;
            if(front!=null && temp.val==front.val){
                while(front!=null && temp.val==front.val){
                    front=front.next;
                }
                prev.next=front;
                temp=front;
            }else{
                prev=prev.next;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}