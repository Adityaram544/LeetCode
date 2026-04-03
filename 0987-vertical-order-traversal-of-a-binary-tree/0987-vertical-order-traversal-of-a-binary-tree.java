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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        helper(root,map,0,0);

        for(Map<Integer,PriorityQueue<Integer>> cols:map.values()){
            List<Integer> ans=new ArrayList<>();
            for(PriorityQueue<Integer> pq:cols.values()){
                while(!pq.isEmpty()){
                    ans.add(pq.poll());
                }
            }
            res.add(ans);
        }
        return res;
    }
    private void helper(TreeNode node,
        Map<Integer,Map<Integer,PriorityQueue<Integer>>> map,int c,int r){
        if(node==null) return;
        map.putIfAbsent(c,new TreeMap<>());
        map.get(c).putIfAbsent(r,new PriorityQueue<>());
        map.get(c).get(r).offer(node.val);

        helper(node.left,map,c-1,r+1);
        helper(node.right,map,c+1,r+1);
    }
}