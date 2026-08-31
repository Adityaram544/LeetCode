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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int res[]={-1,-1};
        ListNode prev=head;
        ListNode temp=head.next;
        if(head==null || head.next==null || head.next.next==null) return res;
        int min=Integer.MAX_VALUE;
        int f=-1,l=-1;
        int node=1;
        while(temp.next!=null){
            ListNode next=temp.next;
            if((prev.val<temp.val && temp.val>next.val) || 
                (prev.val>temp.val && temp.val<next.val)){
                if(f==-1){
                    f=node;
                }else{
                    min=Math.min(min,node-l);
                }
                l=node;
            }
            prev=temp;
            temp=temp.next;
            node++;
        }
        if(f==l) return res;
        res[0]=min;
        res[1]=l-f;
        return res;
    }
}