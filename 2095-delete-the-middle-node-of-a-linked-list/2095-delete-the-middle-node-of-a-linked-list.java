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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int mid=(cnt/2)+1;
        temp=head;
        ListNode prev=null;
        int x=1;
        while(temp!=null){
            if(x==mid){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            x++;
        }
        return head;
    }
}