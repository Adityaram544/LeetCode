class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<>(),0,candidates,target);
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> lst,int idx,int a[],int target){
        if(target<0) return;
        if(target==0){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(i>idx && a[i]==a[i-1]) continue;
            if(a[i]>target) break;
            lst.add(a[i]);
            helper(res,lst,i+1,a,target-a[i]);
            lst.remove(lst.size()-1);
        }
    }
}