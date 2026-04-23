class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> lst:map.values()){
            long total=0;
            for(int x:lst){
                total+=x;
            }
            long preTot=0;
            int l=lst.size();
            for(int i=0;i<l;i++){
                int idx=lst.get(i);
                res[idx]=total-preTot*2+(long)idx*(2*i-l);
                preTot+=idx;
            }
        }
        return res;
    }
}