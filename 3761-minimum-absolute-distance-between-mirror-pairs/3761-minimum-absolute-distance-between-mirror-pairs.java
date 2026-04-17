class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int res=n+1;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                res=Math.min(res,i-map.get(x));
            }
            map.put(reverse(x),i);
        }
        return res==n+1 ? -1 : res;
    }
    private int reverse(int num){
        int res=0;
        while(num>0){
            int temp=num%10;
            res=res*10+temp;
            num/=10;
        }
        return res;
    }
}