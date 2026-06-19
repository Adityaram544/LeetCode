class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean b[]=new boolean[nums.length];
        permutations(res,new ArrayList<>(),nums,b);
        return res;
    }
    private void permutations(List<List<Integer>> res,List<Integer> lst,int nums[],boolean b[]){
        if(lst.size()==nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!b[i]){
                b[i]=true;
                lst.add(nums[i]);
                permutations(res,lst,nums,b);
                lst.remove(lst.size()-1);
                b[i]=false;
            }
        }
    }
}