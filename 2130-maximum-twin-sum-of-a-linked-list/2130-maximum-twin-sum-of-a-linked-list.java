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
        Stack<Integer> stk=new Stack<>();
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            stk.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            maxSum=Math.max(maxSum, slow.val + stk.pop());
            slow=slow.next;
        }
        return maxSum;
    }
}