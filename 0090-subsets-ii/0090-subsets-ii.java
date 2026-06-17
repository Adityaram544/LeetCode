class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(res,new ArrayList<>(),nums,0);
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> lst,int nums[],int pos){
        res.add(new ArrayList<>(lst));
        for(int i=pos;i<nums.length;i++){
            if(i>pos && nums[i]==nums[i-1]) continue;
            lst.add(nums[i]);
            helper(res,lst,nums,i+1);
            lst.remove(lst.size()-1);
        }
    }
}