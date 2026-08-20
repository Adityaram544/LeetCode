class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int l1=a1.get(a1.size()-1);
            int l2=a2.get(a2.size()-1);
            if(l1>l2) a1.add(nums[i]);
            else a2.add(nums[i]);
        }
        int res[]=new int[nums.length];
        int idx=0;
        for(int x:a1) res[idx++]=x;
        for(int x:a2) res[idx++]=x;
        return res;
    }
}