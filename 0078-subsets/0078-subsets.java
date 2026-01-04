class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int s=1<<n;
        for(int num=0;num<s;num++){
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num & (1<<i)) !=0){
                    lst.add(nums[i]);
                }
            }
            res.add(lst);
        }
        return res;
    }
}