class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int minOps=n;
        Arrays.sort(nums);
        ArrayList<Integer> lst=new ArrayList<>();
        for(int x:nums){
            if(lst.isEmpty() || lst.get(lst.size()-1)!=x){
                lst.add(x);
            }
        }
        int r=0;
        for(int l=0;l<lst.size();l++){
            while(r<lst.size() && lst.get(r)<lst.get(l)+n){
                r++;
            }
            minOps=Math.min(minOps,n-(r-l));
        }
        return minOps;
    }
}