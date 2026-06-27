class Solution {
    public int maximumLength(int[] nums) {
        Map<Long,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put((long)x,map.getOrDefault((long)x,0)+1);
        }
        int oneCnt=map.getOrDefault(1L,0);
        int res=(oneCnt & 1)==1 ? oneCnt : oneCnt-1;
        map.remove(1L);
        for(long x:map.keySet()){
            long cur=x;
            int len=0;
            while(map.containsKey(cur) && map.get(cur)>1){
                len+=2;
                cur*=cur;
            }
            res=Math.max(res,len+(map.containsKey(cur) ? 1 : -1));
        }
        return res;
    }
}