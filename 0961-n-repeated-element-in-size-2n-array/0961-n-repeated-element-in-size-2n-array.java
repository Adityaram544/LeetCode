class Solution {
    public int repeatedNTimes(int[] nums) {
        int x=nums.length;
        int n=x/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)==n){
                return k;
            }
        }
        return -1;
    }
}