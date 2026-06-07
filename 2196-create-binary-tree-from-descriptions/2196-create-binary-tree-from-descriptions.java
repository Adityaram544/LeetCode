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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>(descriptions.length+1,1);
        int root=0;
        for(int d[]:descriptions){
            int x=d[0],y=d[1];
            if(!map.containsKey(x)){
                map.put(x,new TreeNode(x));
                root^=x;
            }
            if(!map.containsKey(y)){
                map.put(y,new TreeNode(y));
                root^=y;
            }
            if(d[2]==1){
                map.get(x).left=map.get(y);
            }else{
                map.get(x).right=map.get(y);
            }
            root^=y;
        }
        return map.get(root);
    }
}