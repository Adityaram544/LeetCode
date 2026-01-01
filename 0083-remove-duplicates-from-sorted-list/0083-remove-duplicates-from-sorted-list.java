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
        while(temp!=null){
            ListNode front=temp.next;
            while(front!=null && temp.val==front.val){
                front=front.next;
            }
            temp.next=front;
            temp=temp.next;
        }
        return head;
    }
}