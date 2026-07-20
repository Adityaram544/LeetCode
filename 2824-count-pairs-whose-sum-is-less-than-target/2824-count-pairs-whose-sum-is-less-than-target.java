class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l=0,r=nums.size()-1;
        Collections.sort(nums);
        int cnt=0;
        while(l<r){
            int sum=nums.get(l)+nums.get(r);
            if(sum<target){
                cnt+=(r-l);
                l++;
            }else{
                r--;
            }
        }
        return cnt;
    }
}
// -1 1 1 2 3
// -7 -6 -2 -1 2 3 5