class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxLen=0,cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                if(nums[i]%2==0){
                    cnt++;
                }else{
                    cnt--;
                }
            }
            if(map.containsKey(cnt)){
                maxLen=Math.max(maxLen,i-map.get(cnt));
            }else{
                map.put(cnt,i);
            }
        }
        return maxLen;
    }
}