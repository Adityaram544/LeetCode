class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        Arrays.fill(a,-1);
        Map<Integer,Integer> map=new HashMap<>();
        int res=n+1;
        for(int i=n-1;i>=0;i--){
            if(map.containsKey(nums[i])){
                a[i]=map.get(nums[i]);
            }
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int sPos=a[i];
            if(sPos!=-1){
                int tPos=a[sPos];
                if(tPos!=-1){
                    res=Math.min(res,tPos-i);
                }
            }
        }
        return res==n+1 ? -1 : res*2;
    }
}