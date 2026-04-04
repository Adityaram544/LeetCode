/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        int maxWidth=0;
        while(!q.isEmpty()){
            int n=q.size();
            int f=0,l=0;
            int minIdx=q.peek().index;
            for(int i=0;i<n;i++){
                Pair p=q.poll();
                TreeNode cur=p.node;
                int idx=p.index-minIdx;
                if(i==0) f=idx;
                if(i==n-1) l=idx;
                if(cur.left!=null){
                    q.offer(new Pair(cur.left,2*idx+1));
                }
                if(cur.right!=null){
                    q.offer(new Pair(cur.right,2*idx+2));
                }
            }
            maxWidth=Math.max(maxWidth,l-f+1);
        }
        return maxWidth;
    }
}