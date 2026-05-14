class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        Set<Integer> set=new HashSet<>();
        boolean f=false;
        for(int x:nums){
            if(x>n) return false;
            if(set.contains(x)){
                if(x<n || f) return false;
                f=true;
                continue;
            }
            set.add(x);
        }
        return true;
    }
}