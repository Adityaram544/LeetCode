class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int x:nums){
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return cnt;
    }
}