class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,new ArrayList<>(),0,target,candidates);
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> lst,int idx,int target,int c[]){
        if(target==0){
            res.add(new ArrayList<>(lst));
            return;
        }
        if(idx==c.length) return;
        if(c[idx]<=target){
            lst.add(c[idx]);
            helper(res,lst,idx,target-c[idx],c);
            lst.remove(lst.size()-1);
        }
        helper(res,lst,idx+1,target,c);
    }
}