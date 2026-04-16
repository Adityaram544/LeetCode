class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> pos:map.values()){
            int x=pos.get(0);
            int l=pos.get(pos.size()-1);
            pos.add(0,l-n);
            pos.add(x+n);
        }
        for(int q:queries){
            int x=nums[q];
            List<Integer> lst=map.get(x);
            if(lst.size()==3){
                res.add(-1);
                continue;
            }
            int idx=Collections.binarySearch(lst,q);
            if(idx<0) idx=-idx-1;
            int d=Math.min(
                lst.get(idx+1)-lst.get(idx),
                lst.get(idx)-lst.get(idx-1)
            );
            res.add(d);
        }
        return res;
    }
}