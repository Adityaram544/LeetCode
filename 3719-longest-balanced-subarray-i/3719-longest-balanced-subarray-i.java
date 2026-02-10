class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            int cnt=0;
            for(int j=i;j<n;j++){
                if(!set.contains(nums[j])){
                    set.add(nums[j]);
                    if(nums[j]%2==0){
                        cnt++;
                    }else{
                        cnt--;
                    }
                }
                if(cnt==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}