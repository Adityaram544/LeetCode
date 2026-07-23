class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maxSum=-1;
        for(int x:nums){
            int s=0;
            int org=x;
            while(org>0){
                int temp=org%10;
                s+=temp;
                org/=10;
            }
            if(map.containsKey(s)){
                maxSum=Math.max(maxSum,x+map.get(s));
                map.put(s,Math.max(x,map.get(s)));
            }else{
                map.put(s,x);
            }
        }
        return maxSum;
    }
}