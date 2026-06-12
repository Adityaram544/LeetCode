class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    private int helper(int nums[],int k){
        int cnt=0,l=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}
// 12 121 1212 