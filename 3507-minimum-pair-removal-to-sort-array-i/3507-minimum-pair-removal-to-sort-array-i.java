class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        for(int x:nums){
            lst.add(x);
        }
        int cnt=0;
        while(true){
            boolean f=true;
            for(int i=0;i<lst.size()-1;i++){
                if(lst.get(i)>lst.get(i+1)){
                    f=false;
                    break;
                }
            }
            if(f){
                return cnt;
            }
            int minSum=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<lst.size()-1;i++){
                int sum=lst.get(i)+lst.get(i+1);
                if(sum<minSum){
                    minSum=sum;
                    idx=i;
                }
            }
            lst.set(idx,minSum);
            lst.remove(idx+1);
            cnt++;
        }
    }
}