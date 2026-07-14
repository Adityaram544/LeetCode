class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int minOps=0;
        Arrays.sort(nums);
        ArrayList<Integer> lst=new ArrayList<>();
        for(int x:nums){
            if(lst.isEmpty() || lst.get(lst.size()-1)!=x){
                lst.add(x);
            }
        }
        int l=0;
        for(int r=0;r<lst.size();r++){
            if(lst.get(r)-lst.get(l)>=n){
                l++;
            }
            minOps=Math.max(minOps,r-l+1);
        }
        return n-minOps;
    }
}