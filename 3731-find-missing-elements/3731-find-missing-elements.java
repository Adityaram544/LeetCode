class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int max=0,min=Integer.MAX_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)) res.add(i);
        }
        return res;
    }
}